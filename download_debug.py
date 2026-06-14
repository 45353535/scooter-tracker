import urllib.request, json, os, zipfile

# Get artifact info
url = "https://api.github.com/repos/45353535/scooter-tracker/actions/artifacts/7590475181"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
print("Artifact:", data["name"])
print("Size:", data["size_in_bytes"])

durl = data["archive_download_url"]
print("Download URL:", durl)
req2 = urllib.request.Request(durl, headers={"User-Agent": "curl"})
try:
    resp = urllib.request.urlopen(req2, timeout=30)
    zip_data = resp.read()
    print("Got response, length:", len(zip_data))
    
    if len(zip_data) > 100:
        tmp = r"C:\Users\BELI\Desktop\1\debug_out.zip"
        with open(tmp, "wb") as f:
            f.write(zip_data)
        with zipfile.ZipFile(tmp) as z:
            for name in z.namelist():
                print("\n=== File:", name, "===")
                with z.open(name) as f:
                    print(f.read().decode("utf-8", errors="replace"))
    else:
        print("Response body:", zip_data.decode("utf-8", errors="replace"))
except urllib.error.HTTPError as e:
    print(f"HTTP Error: {e.code} - {e.reason}")
    body = e.read()
    print("Body:", body.decode("utf-8", errors="replace")[:500])
except Exception as e:
    print(f"Error: {e}")
