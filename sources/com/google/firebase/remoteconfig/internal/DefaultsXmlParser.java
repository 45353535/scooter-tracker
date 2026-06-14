package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultsXmlParser {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089 A[Catch: IOException -> 0x0013, XmlPullParserException -> 0x0016, TryCatch #2 {IOException -> 0x0013, XmlPullParserException -> 0x0016, blocks: (B:3:0x0007, B:5:0x000d, B:11:0x0019, B:16:0x002b, B:47:0x008d, B:19:0x0034, B:23:0x0044, B:24:0x0048, B:30:0x0056, B:44:0x007e, B:45:0x0084, B:46:0x0089, B:35:0x0065, B:38:0x006f), top: B:51:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> getDefaultsFromXml(android.content.Context r8, int r9) {
        /*
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            if (r8 != 0) goto L19
            java.lang.String r8 = "Could not find the resources of the current context while trying to set defaults from an XML."
            android.util.Log.e(r0, r8)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            return r1
        L13:
            r8 = move-exception
            goto L92
        L16:
            r8 = move-exception
            goto L92
        L19:
            android.content.res.XmlResourceParser r8 = r8.getXml(r9)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            int r9 = r8.getEventType()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L25:
            r6 = 1
            if (r9 == r6) goto L97
            r7 = 2
            if (r9 != r7) goto L31
            java.lang.String r3 = r8.getName()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            goto L8d
        L31:
            r7 = 3
            if (r9 != r7) goto L51
            java.lang.String r9 = r8.getName()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            java.lang.String r3 = "entry"
            boolean r9 = r9.equals(r3)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            if (r9 == 0) goto L4f
            if (r4 == 0) goto L48
            if (r5 == 0) goto L48
            r1.put(r4, r5)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            goto L4d
        L48:
            java.lang.String r9 = "An entry in the defaults XML has an invalid key and/or value tag."
            android.util.Log.w(r0, r9)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
        L4d:
            r4 = r2
            r5 = r4
        L4f:
            r3 = r2
            goto L8d
        L51:
            r7 = 4
            if (r9 != r7) goto L8d
            if (r3 == 0) goto L8d
            int r9 = r3.hashCode()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            r7 = 106079(0x19e5f, float:1.48648E-40)
            if (r9 == r7) goto L6f
            r7 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r9 == r7) goto L65
            goto L79
        L65:
            java.lang.String r9 = "value"
            boolean r9 = r3.equals(r9)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            if (r9 == 0) goto L79
            r9 = r6
            goto L7a
        L6f:
            java.lang.String r9 = "key"
            boolean r9 = r3.equals(r9)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            if (r9 == 0) goto L79
            r9 = 0
            goto L7a
        L79:
            r9 = -1
        L7a:
            if (r9 == 0) goto L89
            if (r9 == r6) goto L84
            java.lang.String r9 = "Encountered an unexpected tag while parsing the defaults XML."
            android.util.Log.w(r0, r9)     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            goto L8d
        L84:
            java.lang.String r5 = r8.getText()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            goto L8d
        L89:
            java.lang.String r4 = r8.getText()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
        L8d:
            int r9 = r8.next()     // Catch: java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L16
            goto L25
        L92:
            java.lang.String r9 = "Encountered an error while parsing the defaults XML file."
            android.util.Log.e(r0, r9, r8)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.DefaultsXmlParser.getDefaultsFromXml(android.content.Context, int):java.util.Map");
    }
}
