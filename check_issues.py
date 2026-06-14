import urllib.request, json

url = 'https://api.github.com/repos/45353535/scooter-tracker/issues?state=all&per_page=5'
data = json.loads(urllib.request.urlopen(urllib.request.Request(url, headers={'User-Agent':'curl'})).read())
for i in data:
    title = i['title']
    created = i['created_at']
    body = i.get('body','') or ''
    print(f'Issue #{i["number"]}: {title} ({created})')
    print(f'  Body length: {len(body)} chars')
    if body:
        print(f'  Content: {body[:800]}')
        print('  ---')
    else:
        print('  (empty body)')
