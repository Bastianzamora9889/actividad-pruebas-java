import http from 'k6/http';
import { check, sleep } from 'k6';

export const options = {
    vus: 5,
    duration: '10s',
    thresholds: {
        http_req_failed: ['rate<0.05'],
        http_req_duration: ['p(95)<1000'],
    },
};

export default function () {
    const url = 'https://httpbin.org/post';

    const payload = JSON.stringify({
        email: 'usuario@test.com',
        password: '123456',
    });

    const params = {
        headers: {
            'Content-Type': 'application/json',
        },
    };

    const response = http.post(url, payload, params);

    check(response, {
        'login responde correctamente': (r) => r.status === 200,
    });

    sleep(1);
}