package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class aj0 implements wp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq2 f108701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zp f108702b;

    public aj0(jq2 jq2Var, zp zpVar) {
        this.f108701a = jq2Var;
        this.f108702b = zpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // yads.wp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.graphics.drawable.Drawable r9, android.graphics.Bitmap r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            r0 = r9
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r3 = r0.getBitmap()
            if (r3 == 0) goto L14
            android.graphics.Bitmap r9 = r0.getBitmap()
            goto L51
        L14:
            yads.jq2 r0 = r8.f108701a
            r0.getClass()
            int r3 = r9.getIntrinsicWidth()
            int r4 = r9.getIntrinsicHeight()
            if (r3 <= 0) goto L32
            if (r4 > 0) goto L26
            goto L32
        L26:
            yads.zp r0 = r0.f112435a
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r0.getClass()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            goto L3d
        L32:
            yads.zp r0 = r0.f112435a
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0.getClass()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r2, r3)
        L3d:
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            r9.setBounds(r1, r1, r4, r5)
            r9.draw(r3)
            r9 = r0
        L51:
            yads.zp r0 = r8.f108702b
            r0.getClass()
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r9, r2, r2, r2)
            yads.zp r0 = r8.f108702b
            r0.getClass()
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r2, r2, r2)
            int r9 = r9.getPixel(r1, r1)
            int r0 = android.graphics.Color.alpha(r9)
            int r3 = android.graphics.Color.red(r9)
            int r4 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            int r10 = r10.getPixel(r1, r1)
            int r5 = android.graphics.Color.alpha(r10)
            int r6 = android.graphics.Color.red(r10)
            int r7 = android.graphics.Color.green(r10)
            int r10 = android.graphics.Color.blue(r10)
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            r5 = 20
            if (r0 <= r5) goto L95
            goto Lad
        L95:
            int r3 = r3 - r6
            int r0 = java.lang.Math.abs(r3)
            if (r0 <= r5) goto L9d
            goto Lad
        L9d:
            int r4 = r4 - r7
            int r0 = java.lang.Math.abs(r4)
            if (r0 <= r5) goto La5
            goto Lad
        La5:
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            if (r9 > r5) goto Lad
            return r2
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.aj0.a(android.graphics.drawable.Drawable, android.graphics.Bitmap):boolean");
    }
}
