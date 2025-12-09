import certifi
import requests
from core.session import Session


class APIClient:

    def __init__(self):
        self.session = Session()
        self.base_url = self.session.base_url

    def get(self, endpoint):
        url = f"{self.base_url}{endpoint}"
        response = requests.get(url, verify=certifi.where())
        return response

    def post(self, endpoint, payload=None):
        url = f"{self.base_url}{endpoint}"
        response = requests.put(url, json=payload)
        return response
