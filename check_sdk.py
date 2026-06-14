import urllib.request, json

# Find the latest failed run
url = "https://api.github.com/repos/45353535/scooter-tracker/actions/runs?per_page=5"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
for r in data["workflow_runs"]:
    if r["conclusion"] == "failure":
        # Get the failed job
        jurl = r["jobs_url"]
        req2 = urllib.request.Request(jurl, headers={"User-Agent": "curl"})
        jdata = json.loads(urllib.request.urlopen(req2).read())
        for job in jdata["jobs"]:
            for step in job["steps"]:
                if step["conclusion"] == "failure":
                    print(f"Run {r['id']}: Failed step '{step['name']}'")
                    # Try to get the step log
                    # Not directly available, but we know the step name
