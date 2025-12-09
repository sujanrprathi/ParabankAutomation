import json
import os


class Session:
    def __init__(self):
        config_path = os.path.join(os.path.dirname(__file__), "..", "config", "config.json")

        with open(config_path) as file:
            data = json.load(file)

        self.base_url = data["base_url"]
        self.env = data["env"]
        self.username = data["username"]
        self.password = data["password"]

    def get_base_url(self):
        return self.base_url

    def get_username(self):
        return self.username

    def get_password(self):
        return self.password
