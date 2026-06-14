package com.mbridge.msdk.out.reveue;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeRevenueParamsEntityForMax extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForMax(String str, String str2) {
        super(str, str2);
        setMediationName("Max");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        setBidType(java.lang.Boolean.valueOf(r3.optBoolean("isBidding", false)));
        r0 = r3.optJSONArray("credentials");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (r0.length() <= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        r0 = r0.optJSONObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        r1 = new org.json.JSONObject();
        r2 = r0.keys();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (r2.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        r3 = r2.next();
        r1.put(r3, r0.get(r3) + "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        setNetworkInfo(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setMaxAdInfo(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntityForMax.setMaxAdInfo(java.lang.String, java.lang.String):void");
    }

    public void setMaxRevenueInfo(String str, Double d10) {
        setRevenue(d10 + "");
        setPrecision(str + "");
    }
}
