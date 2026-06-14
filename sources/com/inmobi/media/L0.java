package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.L0;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f37241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f37242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f37243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f37244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f37245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f37246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdQualityControl f37247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Hn f37248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdQualityResult f37249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f37250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f37251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f37252l;

    public L0(AdConfig.AdQualityConfig adQualityConfig, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f37241a = adQualityConfig;
        this.f37242b = interfaceC3878m9;
        this.f37243c = new AtomicBoolean(false);
        this.f37244d = new AtomicBoolean(false);
        this.f37245e = new AtomicBoolean(false);
        this.f37246f = new CopyOnWriteArrayList();
        this.f37248h = Hn.f37034a;
        this.f37250j = "";
        this.f37251k = new JSONObject();
        this.f37252l = new AtomicBoolean(false);
    }

    public final void a(String str, byte[] bArr, boolean z10) {
        Context context = Ji.f37157a;
        if (context != null) {
            Ej ej = new Ej(context.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z10) {
                this.f37246f.add(ej);
            }
            AbstractC3667e.a(ej, new J0(this, z10, ej, str), null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: INVOKE 
                  (r1v1 'ej' com.inmobi.media.Ej)
                  (wrap:com.inmobi.media.J0:0x002b: CONSTRUCTOR 
                  (r2v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS])
                  (r5v0 'z10' boolean)
                  (r1v1 'ej' com.inmobi.media.Ej)
                  (r3v0 'str' java.lang.String)
                 A[MD:(com.inmobi.media.L0, boolean, com.inmobi.media.Ej, java.lang.String):void (m), WRAPPED] (LINE:5) call: com.inmobi.media.J0.<init>(com.inmobi.media.L0, boolean, com.inmobi.media.Ej, java.lang.String):void type: CONSTRUCTOR)
                  (null java.lang.Long)
                  (wrap:kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: w3.w6.<init>():void type: CONSTRUCTOR)
                 STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, kotlin.jvm.functions.Function0):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, kotlin.jvm.functions.Function0):void (m)] (LINE:3) in method: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: w3.w6, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 43 more
                */
            /*
                this = this;
                android.content.Context r0 = com.inmobi.media.Ji.f37157a
                if (r0 == 0) goto L31
                java.io.File r0 = r0.getFilesDir()
                java.lang.String r0 = r0.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "/adQuality/screenshots"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.inmobi.media.Ej r1 = new com.inmobi.media.Ej
                r1.<init>(r0, r4)
                if (r5 != 0) goto L29
                java.util.concurrent.CopyOnWriteArrayList r4 = r2.f37246f
                r4.add(r1)
            L29:
                com.inmobi.media.J0 r4 = new com.inmobi.media.J0
                r4.<init>(r2, r5, r1, r3)
                com.inmobi.media.AbstractC3667e.a(r1, r4)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void");
        }

        public final void a(Activity activity, String url, boolean z10, JSONObject extras, Qh listener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.f37250j = url;
                this.f37251k = extras;
                a("report ad starting");
                if (z10) {
                    a("report ad capture");
                    a(activity, 0L, true, listener);
                    return;
                } else {
                    a("report ad report");
                    a(new AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f37597a.g("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (Exception) null);
        }

        public final void a(GestureDetectorOnGestureListenerC3635ci view, String url, boolean z10, JSONObject extras, Qh listener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.f37250j = url;
                this.f37251k = extras;
                if (z10) {
                    a(view, 0L, true, listener);
                    return;
                } else {
                    a(new AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f37597a.g("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (Exception) null);
        }

        public final boolean a() {
            if (this.f37243c.get()) {
                a("ad quality session is already in progress. skipping...");
                return false;
            }
            if (!this.f37241a.getEnabled()) {
                a("config kill switch while state check - false. ad quality will skip");
                return false;
            }
            if (this.f37247g == null) {
                a("setup not done. skipping");
                return false;
            }
            Hn hn = this.f37248h;
            if (hn != Hn.f37034a && hn != Hn.f37035b) {
                return true;
            }
            a("ad view is not visible. skipping");
            return false;
        }

        public final void a(AdQualityResult adQualityResult, boolean z10) {
            if (adQualityResult.getBeaconUrl().length() != 0) {
                AbstractC3667e.a(new C3861lh(adQualityResult), new I0(this, z10), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE 
                      (wrap:com.inmobi.media.lh:0x0012: CONSTRUCTOR (r2v0 'adQualityResult' com.inmobi.adquality.models.AdQualityResult) A[MD:(com.inmobi.adquality.models.AdQualityResult):void (m), WRAPPED] (LINE:38) call: com.inmobi.media.lh.<init>(com.inmobi.adquality.models.AdQualityResult):void type: CONSTRUCTOR)
                      (wrap:com.inmobi.media.I0:0x0017: CONSTRUCTOR (r1v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS]), (r3v0 'z10' boolean) A[MD:(com.inmobi.media.L0, boolean):void (m), WRAPPED] (LINE:39) call: com.inmobi.media.I0.<init>(com.inmobi.media.L0, boolean):void type: CONSTRUCTOR)
                      (null java.lang.Long)
                      (wrap:kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: w3.w6.<init>():void type: CONSTRUCTOR)
                     STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, kotlin.jvm.functions.Function0):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Eg, java.lang.Long, kotlin.jvm.functions.Function0):void (m)] (LINE:3) in method: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: w3.w6, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 41 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = r2.getBeaconUrl()
                    int r0 = r0.length()
                    if (r0 != 0) goto L10
                    java.lang.String r2 = "beacon is empty"
                    r1.a(r2)
                    return
                L10:
                    com.inmobi.media.lh r0 = new com.inmobi.media.lh
                    r0.<init>(r2)
                    com.inmobi.media.I0 r2 = new com.inmobi.media.I0
                    r2.<init>(r1, r3)
                    com.inmobi.media.AbstractC3667e.a(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void");
            }

            public final void a(final GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, final long j10, final boolean z10, final Qh qh2) {
                a("isCapture started - " + this.f37252l.get() + ", isReporting - " + z10);
                if (this.f37252l.get() && !z10) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    gestureDetectorOnGestureListenerC3635ci.post(new Runnable() { // from class: w3.s2
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.a(this.f107290b, gestureDetectorOnGestureListenerC3635ci, j10, z10, qh2);
                        }
                    });
                }
            }

            public static final void a(L0 l02, View adView, long j10, boolean z10, Qh qh2) {
                l02.getClass();
                Intrinsics.checkNotNullParameter(adView, "adView");
                l02.a(new Hi(adView, l02.f37241a), j10, z10, qh2);
                l02.f37252l.set(!z10);
            }

            public final void a(final Activity activity, final long j10, final boolean z10, final Qh qh2) {
                a("isCapture started - " + this.f37252l.get() + ", isReporting - " + z10);
                if (this.f37252l.get() && !z10) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    activity.getWindow().getDecorView().post(new Runnable() { // from class: w3.q2
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.a(this.f107254b, activity, j10, z10, qh2);
                        }
                    });
                }
            }

            public static final void a(L0 l02, Activity activity, long j10, boolean z10, Qh qh2) {
                l02.a("activity is visible");
                Window window = activity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                Intrinsics.checkNotNullParameter(window, "window");
                l02.a(new C3985qg(window, l02.f37241a), j10, z10, qh2);
                l02.f37252l.set(!z10);
            }

            public final void a(AbstractC4045t2 abstractC4045t2, long j10, boolean z10, Qh qh2) {
                if (!z10) {
                    this.f37246f.add(abstractC4045t2);
                }
                AbstractC3667e.a(abstractC4045t2, new K0(this, abstractC4045t2, z10, qh2), Long.valueOf(j10), new Function0() { // from class: w3.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(L0.a(this.f107274b));
                    }
                });
            }

            public static final boolean a(L0 l02) {
                return l02.f37248h == Hn.f37036c;
            }

            public final void a(Bitmap bitmap, M0 process, boolean z10, Qh qh2) {
                String beacon;
                Intrinsics.checkNotNullParameter(process, "process");
                a("Screen shot result received - isReporting - " + z10);
                this.f37246f.remove(process);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap != null) {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (bitmap != null && qh2 != null) {
                    qh2.f37597a.g("window.mraidview.broadcastEvent('ScreenshotSuccess')");
                }
                if (!z10) {
                    AdQualityControl adQualityControl = this.f37247g;
                    if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                        a("saving to file - beacon - " + beacon);
                        Intrinsics.checkNotNull(byteArray);
                        a(beacon, byteArray, false);
                    }
                } else {
                    String str = this.f37250j;
                    Intrinsics.checkNotNull(byteArray);
                    a(str, byteArray, true);
                }
                this.f37252l.set(false);
            }

            public final void a(Exception exc, M0 process) {
                Intrinsics.checkNotNullParameter(process, "process");
                a("error in running process - " + process.getClass().getSimpleName(), exc);
                this.f37246f.remove(process);
                a(true);
            }

            public final void a(String result, M0 process, String beacon, boolean z10) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(process, "process");
                Intrinsics.checkNotNullParameter(beacon, "beacon");
                if (z10) {
                    a(new AdQualityResult(result, null, beacon, this.f37251k.toString()), false);
                    return;
                }
                this.f37246f.remove(process);
                AdQualityResult adQualityResult = this.f37249i;
                if (adQualityResult != null) {
                    adQualityResult.setImageLocation(result);
                } else {
                    this.f37249i = new AdQualityResult(result, null, beacon, null, 8, null);
                }
                a("file is saved. result - " + this.f37249i);
                a(true);
            }

            public final void a(boolean z10) {
                String beacon;
                AdQualityControl adQualityControl = this.f37247g;
                if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
                    return;
                }
                if (this.f37246f.isEmpty() && this.f37244d.get() && !this.f37245e.get()) {
                    this.f37245e.set(true);
                    a("session end - queuing result");
                    AdQualityResult adQualityResult = this.f37249i;
                    if (adQualityResult == null) {
                        adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
                if (this.f37244d.get() && !z10 && !this.f37245e.get()) {
                    this.f37245e.set(true);
                    a("session stop - queuing result");
                    CoroutineScope coroutineScope = E0.f36766e;
                    if (coroutineScope != null) {
                        kotlinx.coroutines.i.d(coroutineScope, new CancellationException("Shutdown"));
                    }
                    E0.f36766e = null;
                    AdQualityResult adQualityResult2 = this.f37249i;
                    if (adQualityResult2 == null) {
                        adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult2, true);
                    return;
                }
                this.f37246f.size();
                this.f37244d.get();
                Objects.toString(this.f37245e);
            }

            public final void a(String str) {
                InterfaceC3878m9 interfaceC3878m9 = this.f37242b;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).a("AdQualityManager", str);
                }
            }

            public final void a(String str, Exception exc) {
                Unit unit;
                if (exc != null) {
                    InterfaceC3878m9 interfaceC3878m9 = this.f37242b;
                    if (interfaceC3878m9 != null) {
                        ((C3903n9) interfaceC3878m9).a("AdQualityManager", str, exc);
                        unit = Unit.f93236a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                InterfaceC3878m9 interfaceC3878m92 = this.f37242b;
                if (interfaceC3878m92 != null) {
                    ((C3903n9) interfaceC3878m92).b("AdQualityManager", "Error with null exception : " + str);
                    Unit unit2 = Unit.f93236a;
                }
            }
        }
