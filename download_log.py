import urllib.request, json, os, zipfile

# Get artifact info
url = "https://api.github.com/repos/45353535/scooter-tracker/actions/artifacts/7590279997"
req = urllib.request.Request(url, headers={"User-Agent": "curl"})
data = json.loads(urllib.request.urlopen(req).read())
print("Artifact:", data["name"])
print("Size:", data["size_in_bytes"])

# Download
durl = data["archive_download_url"]
req2 = urllib.request.Request(durl, headers={"User-Agent": "curl"})
resp = urllib.request.urlopen(req2)
# Follow redirect
actual_url = resp.geturl()
print("Redirect to:", actual_url[:80] + "...")

# Download the zip
zip_data = urllib.request.urlopen(req2).read()
tmp = "C:\\Users\\BELI\\Desktop\\1\\gradle_log.zip"
with open(tmp, "wb") as f:
    f.write(zip_data)
print("Downloaded", len(zip_data), "bytes")

# Extract and print
with zipfile.ZipFile(tmp) as z:
    for name in z.namelist():
        print("File:", name)
        with z.open(name) as f:
            content = f.read().decode("utf-8", errors="replace")
            print(content[:3000])
