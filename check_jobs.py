import urllib.request, json

run_id = 27412256025
url = f"https://api.github.com/repos/45353535/scooter-tracker/actions/runs/{run_id}/jobs"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
for job in data["jobs"]:
    print(f'Job: {job["name"]} - {job["conclusion"]}')
    for step in job["steps"]:
        print(f'  Step: {step["name"]} - {step["conclusion"]}')
