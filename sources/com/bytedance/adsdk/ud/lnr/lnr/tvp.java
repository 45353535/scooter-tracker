package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.ud.lnr.qdl.rq;
import com.bytedance.adsdk.ud.lnr.ud;
import com.bytedance.adsdk.ud.lnr.ud.jtx;
import com.bytedance.adsdk.ud.qdl.ud.bjy;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class tvp extends com.bytedance.adsdk.ud.lnr.lnr.qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> aaj;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> bch;
    private final bjy bjy;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Typeface, Typeface> bqt;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> exc;
    private final LongSparseArray<String> exu;
    private final Map<com.bytedance.adsdk.ud.lnr.mml, List<com.bytedance.adsdk.ud.qdl.qdl.mml>> fs;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> jl;
    private final RectF jpc;
    private final com.bytedance.adsdk.ud.tvp jtx;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> jyq;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> ljh;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> oth;
    private final List<qdl> rdp;
    private final Paint rq;
    private final Paint to;
    private final Matrix tvp;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> uw;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final StringBuilder f16007wd;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> xmv;
    private final com.bytedance.adsdk.ud.wd yt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.lnr.lnr.tvp$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ud.qdl.values().length];
            qdl = iArr;
            try {
                iArr[ud.qdl.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ud.qdl.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ud.qdl.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class qdl {
        private String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private float f16008ud;

        private qdl() {
            this.qdl = "";
            this.f16008ud = 0.0f;
        }

        void qdl(String str, float f10) {
            this.qdl = str;
            this.f16008ud = f10;
        }
    }

    tvp(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar2;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar2;
        super(tvpVar, mzzVar);
        this.f16007wd = new StringBuilder(2);
        this.jpc = new RectF();
        this.tvp = new Matrix();
        int i10 = 1;
        this.to = new Paint(i10) { // from class: com.bytedance.adsdk.ud.lnr.lnr.tvp.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.rq = new Paint(i10) { // from class: com.bytedance.adsdk.ud.lnr.lnr.tvp.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.fs = new HashMap();
        this.exu = new LongSparseArray<>();
        this.rdp = new ArrayList();
        this.jtx = tvpVar;
        this.yt = mzzVar.qdl();
        bjy bjyVarQdl = mzzVar.exc().qdl();
        this.bjy = bjyVarQdl;
        bjyVarQdl.qdl(this);
        qdl(bjyVarQdl);
        rq rqVarAaj = mzzVar.aaj();
        if (rqVarAaj != null && (qdlVar2 = rqVarAaj.qdl) != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl = qdlVar2.qdl();
            this.jl = qdlVarQdl;
            qdlVarQdl.qdl(this);
            qdl(this.jl);
        }
        if (rqVarAaj != null && (qdlVar = rqVarAaj.f16017ud) != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl2 = qdlVar.qdl();
            this.aaj = qdlVarQdl2;
            qdlVarQdl2.qdl(this);
            qdl(this.aaj);
        }
        if (rqVarAaj != null && (udVar2 = rqVarAaj.lnr) != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = udVar2.qdl();
            this.oth = qdlVarQdl3;
            qdlVarQdl3.qdl(this);
            qdl(this.oth);
        }
        if (rqVarAaj == null || (udVar = rqVarAaj.mml) == null) {
            return;
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl4 = udVar.qdl();
        this.bch = qdlVarQdl4;
        qdlVarQdl4.qdl(this);
        qdl(this.bch);
    }

    private boolean lnr(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z10) {
        super.qdl(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.yt.mml().width(), this.yt.mml().height());
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i10) {
        super.ud(canvas, matrix, i10);
        com.bytedance.adsdk.ud.lnr.ud udVarWd = this.bjy.wd();
        com.bytedance.adsdk.ud.lnr.lnr lnrVar = this.yt.bjy().get(udVarWd.f16019ud);
        if (lnrVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        qdl(udVarWd, matrix);
        if (this.jtx.uw()) {
            qdl(udVarWd, matrix, lnrVar, canvas);
        } else {
            qdl(udVarWd, lnrVar, canvas);
        }
        canvas.restore();
    }

    private void qdl(com.bytedance.adsdk.ud.lnr.ud udVar, Matrix matrix) {
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar = this.exc;
        if (qdlVar != null) {
            this.to.setColor(qdlVar.wd().intValue());
        } else {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar2 = this.jl;
            if (qdlVar2 != null) {
                this.to.setColor(qdlVar2.wd().intValue());
            } else {
                this.to.setColor(udVar.jpc);
            }
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar3 = this.jyq;
        if (qdlVar3 != null) {
            this.rq.setColor(qdlVar3.wd().intValue());
        } else {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar4 = this.aaj;
            if (qdlVar4 != null) {
                this.rq.setColor(qdlVar4.wd().intValue());
            } else {
                this.rq.setColor(udVar.tvp);
            }
        }
        int iIntValue = ((this.mml.qdl() == null ? 100 : this.mml.qdl().wd().intValue()) * 255) / 100;
        this.to.setAlpha(iIntValue);
        this.rq.setAlpha(iIntValue);
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar5 = this.ljh;
        if (qdlVar5 != null) {
            this.rq.setStrokeWidth(qdlVar5.wd().floatValue());
            return;
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar6 = this.oth;
        if (qdlVar6 != null) {
            this.rq.setStrokeWidth(qdlVar6.wd().floatValue());
        } else {
            this.rq.setStrokeWidth(udVar.to * com.bytedance.adsdk.ud.mo.mo.qdl());
        }
    }

    private qdl ud(int i10) {
        for (int size = this.rdp.size(); size < i10; size++) {
            this.rdp.add(new qdl());
        }
        return this.rdp.get(i10 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(com.bytedance.adsdk.ud.lnr.ud r17, android.graphics.Matrix r18, com.bytedance.adsdk.ud.lnr.lnr r19, android.graphics.Canvas r20) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            com.bytedance.adsdk.ud.qdl.ud.qdl<java.lang.Float, java.lang.Float> r1 = r0.xmv
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.wd()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.lnr
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = com.bytedance.adsdk.ud.mo.mo.qdl(r18)
            java.lang.String r1 = r7.qdl
            java.util.List r9 = r0.qdl(r1)
            int r10 = r9.size()
            int r1 = r7.mzz
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            com.bytedance.adsdk.ud.qdl.ud.qdl<java.lang.Float, java.lang.Float> r2 = r0.uw
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.wd()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            com.bytedance.adsdk.ud.qdl.ud.qdl<java.lang.Float, java.lang.Float> r2 = r0.bch
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.wd()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto La7
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.exu
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.qdl(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto L9d
            java.lang.Object r1 = r14.get(r15)
            com.bytedance.adsdk.ud.lnr.lnr.tvp$qdl r1 = (com.bytedance.adsdk.ud.lnr.lnr.tvp.qdl) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = com.bytedance.adsdk.ud.lnr.lnr.tvp.qdl.qdl(r1)
            r3 = r20
            r0.qdl(r3, r7, r12, r2)
            java.lang.String r1 = com.bytedance.adsdk.ud.lnr.lnr.tvp.qdl.ud(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r0.qdl(r1, r2, r3, r4, r5, r6, r7)
            r4 = r6
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L69
        L9d:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.lnr.lnr.tvp.qdl(com.bytedance.adsdk.ud.lnr.ud, android.graphics.Matrix, com.bytedance.adsdk.ud.lnr.lnr, android.graphics.Canvas):void");
    }

    private void qdl(String str, com.bytedance.adsdk.ud.lnr.ud udVar, com.bytedance.adsdk.ud.lnr.lnr lnrVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.bytedance.adsdk.ud.lnr.mml mmlVar = this.yt.rdp().get(com.bytedance.adsdk.ud.lnr.mml.qdl(str.charAt(i10), lnrVar.qdl(), lnrVar.lnr()));
            if (mmlVar != null) {
                qdl(mmlVar, f11, udVar, canvas);
                canvas.translate((((float) mmlVar.ud()) * f11 * com.bytedance.adsdk.ud.mo.mo.qdl()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(com.bytedance.adsdk.ud.lnr.ud r13, com.bytedance.adsdk.ud.lnr.lnr r14, android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.lnr.lnr.tvp.qdl(com.bytedance.adsdk.ud.lnr.ud, com.bytedance.adsdk.ud.lnr.lnr, android.graphics.Canvas):void");
    }

    private void qdl(Canvas canvas, com.bytedance.adsdk.ud.lnr.ud udVar, int i10, float f10) {
        PointF pointF = udVar.fs;
        PointF pointF2 = udVar.exu;
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        float f11 = (i10 * udVar.mo * fQdl) + (pointF == null ? 0.0f : (udVar.mo * 0.6f * fQdl) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.qdl[udVar.mml.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
    }

    private Typeface qdl(com.bytedance.adsdk.ud.lnr.lnr lnrVar) {
        Typeface typefaceWd;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Typeface, Typeface> qdlVar = this.bqt;
        if (qdlVar != null && (typefaceWd = qdlVar.wd()) != null) {
            return typefaceWd;
        }
        Typeface typefaceQdl = this.jtx.qdl(lnrVar);
        return typefaceQdl != null ? typefaceQdl : lnrVar.mml();
    }

    private List<String> qdl(String str) {
        return Arrays.asList(str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll("\u0003", "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
    }

    private void qdl(String str, com.bytedance.adsdk.ud.lnr.ud udVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strQdl = qdl(str, length);
            length += strQdl.length();
            qdl(strQdl, udVar, canvas);
            canvas.translate(this.to.measureText(strQdl) + f10, 0.0f);
        }
    }

    private List<qdl> qdl(String str, float f10, com.bytedance.adsdk.ud.lnr.lnr lnrVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.ud.lnr.mml mmlVar = this.yt.rdp().get(com.bytedance.adsdk.ud.lnr.mml.qdl(cCharAt, lnrVar.qdl(), lnrVar.lnr()));
                if (mmlVar != null) {
                    fMeasureText = ((float) mmlVar.ud()) * f11 * com.bytedance.adsdk.ud.mo.mo.qdl();
                }
            } else {
                fMeasureText = this.to.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                qdl qdlVarUd = ud(i10);
                if (i12 == i11) {
                    qdlVarUd.qdl(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    qdlVarUd.qdl(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            ud(i10).qdl(str.substring(i11), f13);
        }
        return this.rdp.subList(0, i10);
    }

    private void qdl(com.bytedance.adsdk.ud.lnr.mml mmlVar, float f10, com.bytedance.adsdk.ud.lnr.ud udVar, Canvas canvas) {
        List<com.bytedance.adsdk.ud.qdl.qdl.mml> listQdl = qdl(mmlVar);
        for (int i10 = 0; i10 < listQdl.size(); i10++) {
            Path pathMml = listQdl.get(i10).mml();
            pathMml.computeBounds(this.jpc, false);
            this.tvp.reset();
            this.tvp.preTranslate(0.0f, (-udVar.f16020wd) * com.bytedance.adsdk.ud.mo.mo.qdl());
            this.tvp.preScale(f10, f10);
            pathMml.transform(this.tvp);
            if (udVar.rq) {
                qdl(pathMml, this.to, canvas);
                qdl(pathMml, this.rq, canvas);
            } else {
                qdl(pathMml, this.rq, canvas);
                qdl(pathMml, this.to, canvas);
            }
        }
    }

    private void qdl(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void qdl(String str, com.bytedance.adsdk.ud.lnr.ud udVar, Canvas canvas) {
        if (udVar.rq) {
            qdl(str, this.to, canvas);
            qdl(str, this.rq, canvas);
        } else {
            qdl(str, this.rq, canvas);
            qdl(str, this.to, canvas);
        }
    }

    private void qdl(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.ud.qdl.qdl.mml> qdl(com.bytedance.adsdk.ud.lnr.mml mmlVar) {
        if (this.fs.containsKey(mmlVar)) {
            return this.fs.get(mmlVar);
        }
        List<jtx> listQdl = mmlVar.qdl();
        int size = listQdl.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.bytedance.adsdk.ud.qdl.qdl.mml(this.jtx, this, listQdl.get(i10), this.yt));
        }
        this.fs.put(mmlVar, arrayList);
        return arrayList;
    }

    private String qdl(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!lnr(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.exu.indexOfKey(j10) >= 0) {
            return this.exu.get(j10);
        }
        this.f16007wd.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.f16007wd.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.f16007wd.toString();
        this.exu.put(j10, string);
        return string;
    }
}
