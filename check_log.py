import urllib.request, json, sys

# Get latest commit checks
url = "https://api.github.com/repos/45353535/scooter-tracker/commits/master/check-runs"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
runs = data.get("check_runs", [])
if not runs:
    print("No check runs found")
    sys.exit(1)

run = runs[0]
print(f"Check Run: {run['id']} - {run['name']} - {run['status']}/{run['conclusion']}")
print(f"  Details: {run.get('details_url', 'none')}")

# Get annotations
aurl = run.get("output", {}).get("annotations_url", "")
if aurl:
    req2 = urllib.request.Request(aurl, headers={"User-Agent": "curl"})
    annots = json.loads(urllib.request.urlopen(req2).read())
    print(f"\nAnnotations ({len(annots)}):")
    for a in annots:
        print(f"  [{a['annotation_level']}] {a.get('path','')}:{a.get('start_line','')}")
        print(f"    {a.get('message','')[:500]}")
        if a.get('raw_details'):
            print(f"    Raw: {a['raw_details'][:500]}")

# Try step logs via check suite
for a_ in runs:
    print(f"\n  Run: {a_['name']} - {a_['conclusion']}")
    out = a_.get("output", {})
    if out.get("title"):
        print(f"  Title: {out['title']}")
    if out.get("summary"):
        print(f"  Summary: {out['summary'][:300]}")
    if out.get("text"):
        print(f"  Text: {out['text'][:500]}")
