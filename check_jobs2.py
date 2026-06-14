import urllib.request, json

url = "https://api.github.com/repos/45353535/scooter-tracker/actions/runs?per_page=1"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
run = data["workflow_runs"][0]
run_id = run["id"]
print(f"Run {run_id}: {run['status']} {run.get('conclusion','?')}")
print(f"  Title: {run['display_title']}")

jurl = f"https://api.github.com/repos/45353535/scooter-tracker/actions/runs/{run_id}/jobs"
req2 = urllib.request.Request(jurl, headers={"User-Agent": "curl"})
jdata = json.loads(urllib.request.urlopen(req2).read())
for job in jdata["jobs"]:
    print(f"Job: {job['name']} - {job['conclusion']}")
    for step in job["steps"]:
        print(f"  {step['name']} - {step['conclusion']}")
