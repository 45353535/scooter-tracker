import urllib.request, json, sys, os

def dl_artifact(aid, outdir):
    url = f"https://api.github.com/repos/45353535/scooter-tracker/actions/artifacts/{aid}/zip"
    req = urllib.request.Request(url, headers={"User-Agent": "github-actions"})
    try:
        resp = urllib.request.urlopen(req, timeout=30)
        data = resp.read()
        if len(data) > 100:
            os.makedirs(outdir, exist_ok=True)
            zippath = os.path.join(outdir, "artifact.zip")
            with open(zippath, "wb") as f:
                f.write(data)
            import zipfile
            with zipfile.ZipFile(zippath) as z:
                for name in z.namelist():
                    print(f"\n--- {name} ---")
                    with z.open(name) as f:
                        print(f.read().decode("utf-8", errors="replace"))
        else:
            print(f"Artifact response: {data.decode('utf-8')}")
    except Exception as e:
        print(f"Error downloading artifact: {e}")

url = "https://api.github.com/repos/45353535/scooter-tracker/actions/runs?per_page=1"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
r = data["workflow_runs"][0]
print(f'Run {r["id"]}: {r["status"]} / {r.get("conclusion","?")}')
print(f'  Title: {r["display_title"]}')

aurl = r["artifacts_url"]
req2 = urllib.request.Request(aurl, headers={"User-Agent": "curl"})
ad = json.loads(urllib.request.urlopen(req2).read())
print(f'  Artifacts: {ad["total_count"]}')
for a in ad["artifacts"]:
    print(f'  - {a["name"]} (id={a["id"]})')
    if "--get-debug" in sys.argv and a["name"] == "debug-output":
        dl_artifact(a["id"], "artifact_debug")
