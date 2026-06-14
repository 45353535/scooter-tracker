import urllib.request, json

# Check run output details
url = "https://api.github.com/repos/45353535/scooter-tracker/commits/master/check-runs"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
runs = data.get("check_runs", [])
if not runs:
    print("No check runs")
    exit()

run = runs[0]
cid = run["id"]
print(f"Check run: {cid}")

# Get full check run details including output
url2 = f"https://api.github.com/repos/45353535/scooter-tracker/check-runs/{cid}"
req2 = urllib.request.Request(url2, headers={"User-Agent": "curl"})
full = json.loads(urllib.request.urlopen(req2).read())
out = full.get("output", {})
print(f"Title: {out.get('title','')}")
print(f"Summary: {out.get('summary','')}")
text = out.get("text", "")
if text:
    print(f"Text ({len(text)} chars):")
    print(text[:2000])
else:
    print("No text content")

# Also try the summary markdown via API
print("\n--- Full output dict ---")
print(json.dumps(full.get("output", {}), indent=2)[:3000])
