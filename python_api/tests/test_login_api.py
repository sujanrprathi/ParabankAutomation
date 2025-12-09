from core.api_client import APIClient


def test_login_api():
    client = APIClient()

    response = client.get("/login/john/demo")

    print("Status Code:", response.status_code)
    print("Response Body:", response.text)

    assert response.status_code == 200
