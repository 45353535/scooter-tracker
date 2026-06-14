package net.pubnative.lite.sdk.views.shape.path.parser;

/* JADX INFO: loaded from: classes3.dex */
class ParserHelper {
    private static final double[] pow10 = new double[128];
    private char current;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f96052n;
    public int pos = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final CharSequence f96053s;

    static {
        int i10 = 0;
        while (true) {
            double[] dArr = pow10;
            if (i10 >= dArr.length) {
                return;
            }
            dArr[i10] = Math.pow(10.0d, i10);
            i10++;
        }
    }

    public ParserHelper(CharSequence charSequence) {
        this.f96053s = charSequence;
        this.f96052n = charSequence.length();
        this.current = charSequence.charAt(this.pos);
    }

    private static float buildFloat(int i10, int i11) {
        if (i11 < -125 || i10 == 0) {
            return 0.0f;
        }
        if (i11 >= 128) {
            return i10 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }
        if (i11 == 0) {
            return i10;
        }
        if (i10 >= 67108864) {
            i10++;
        }
        return (float) (i11 > 0 ? ((double) i10) * pow10[i11] : ((double) i10) / pow10[-i11]);
    }

    private char read() {
        int i10 = this.pos;
        int i11 = this.f96052n;
        if (i10 < i11) {
            this.pos = i10 + 1;
        }
        int i12 = this.pos;
        if (i12 == i11) {
            return (char) 0;
        }
        return this.f96053s.charAt(i12);
    }

    private void reportUnexpectedCharacterError(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public void advance() {
        this.current = read();
    }

    public float nextFloat() {
        skipWhitespace();
        float f10 = parseFloat();
        skipNumberSeparator();
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[LOOP:0: B:13:0x0028->B:84:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae A[PHI: r3
  0x00ae: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean) binds: [B:49:0x00a2, B:54:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb A[PHI: r3
  0x00bb: PHI (r3v2 boolean) = (r3v1 boolean), (r3v0 boolean) binds: [B:56:0x00b4, B:51:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    float parseFloat() {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.views.shape.path.parser.ParserHelper.parseFloat():float");
    }

    void skipNumberSeparator() {
        while (true) {
            int i10 = this.pos;
            if (i10 >= this.f96052n) {
                return;
            }
            char cCharAt = this.f96053s.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != ' ' && cCharAt != ',') {
                return;
            } else {
                advance();
            }
        }
    }

    public void skipWhitespace() {
        while (true) {
            int i10 = this.pos;
            if (i10 >= this.f96052n || !Character.isWhitespace(this.f96053s.charAt(i10))) {
                return;
            } else {
                advance();
            }
        }
    }
}
