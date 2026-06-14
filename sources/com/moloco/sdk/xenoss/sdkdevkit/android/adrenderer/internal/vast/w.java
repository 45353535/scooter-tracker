package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f58354a = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w.w();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NumberFormat f58355b = NumberFormat.getPercentInstance();

    public static final class a extends kotlin.coroutines.jvm.internal.d {
        public int A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58356r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58357s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58358t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58359u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58360v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58361w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58362x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58363y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f58364z;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58364z = obj;
            this.A |= Integer.MIN_VALUE;
            return w.k(null, this);
        }
    }

    public static final class a0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58366s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58367t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58368u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58369v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.f58367t = xmlPullParser;
            this.f58368u = ref$ObjectRef;
            this.f58369v = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a0 a0Var = new a0(this.f58367t, continuation, this.f58368u, this.f58369v);
            a0Var.f58366s = obj;
            return a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58365r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58366s);
            if (w.n0(this.f58367t)) {
                this.f58367t.nextTag();
            }
            if (w.i0(this.f58367t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58367t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58367t.getDepth();
            while (this.f58367t.getDepth() >= depth) {
                int depth2 = this.f58367t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58367t);
                    }
                } else if (w.p0(this.f58367t)) {
                    XmlPullParser xmlPullParser = this.f58367t;
                    Ref$ObjectRef ref$ObjectRef = this.f58368u;
                    String strG = w.G(xmlPullParser, "xmlEncoded");
                    ref$ObjectRef.f93280b = strG != null ? kotlin.coroutines.jvm.internal.b.a(Boolean.parseBoolean(strG)) : null;
                } else if (w.r0(this.f58367t) && (text = this.f58367t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58367t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58369v.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58367t)) {
                    return Unit.f93236a;
                }
                this.f58367t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ Ref$ObjectRef A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ List C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58370r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58371s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58372t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58373u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58374v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58375w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58376x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ List f58377y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ List f58378z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, List list, List list2, Ref$ObjectRef ref$ObjectRef4, boolean z10, List list3) {
            super(2, continuation);
            this.f58373u = xmlPullParser;
            this.f58374v = ref$ObjectRef;
            this.f58375w = ref$ObjectRef2;
            this.f58376x = ref$ObjectRef3;
            this.f58377y = list;
            this.f58378z = list2;
            this.A = ref$ObjectRef4;
            this.B = z10;
            this.C = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f58373u, continuation, this.f58374v, this.f58375w, this.f58376x, this.f58377y, this.f58378z, this.A, this.B, this.C);
            bVar.f58372t = obj;
            return bVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        
            if (r6 == r0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
        
            if (r6 == r0) goto L81;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0096 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a0 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a8 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ae -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b9 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00db -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ec -> B:49:0x00f0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00fd -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x011f -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x013d -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0164 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0184 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01a6 -> B:98:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01bf -> B:98:0x01c4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 514
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58379r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58380s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58381t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58382u;

        public b0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58381t = obj;
            this.f58382u |= Integer.MIN_VALUE;
            return w.G0(null, this);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {
        public int A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f58383r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58384s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58385t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58386u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58387v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58388w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58389x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58390y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f58391z;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58391z = obj;
            this.A |= Integer.MIN_VALUE;
            return w.e0(null, false, this);
        }
    }

    public static final class c0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58395u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58396v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.f58394t = xmlPullParser;
            this.f58395u = ref$ObjectRef;
            this.f58396v = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c0 c0Var = new c0(this.f58394t, continuation, this.f58395u, this.f58396v);
            c0Var.f58393s = obj;
            return c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58392r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58393s);
            if (w.n0(this.f58394t)) {
                this.f58394t.nextTag();
            }
            if (w.i0(this.f58394t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58394t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58394t.getDepth();
            while (this.f58394t.getDepth() >= depth) {
                int depth2 = this.f58394t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58394t);
                    }
                } else if (w.p0(this.f58394t)) {
                    this.f58395u.f93280b = w.G(this.f58394t, "version");
                } else if (w.r0(this.f58394t) && (text = this.f58394t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58394t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58396v.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58394t)) {
                    return Unit.f93236a;
                }
                this.f58394t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ Ref$ObjectRef A;
        public final /* synthetic */ Ref$ObjectRef B;
        public final /* synthetic */ Ref$ObjectRef C;
        public final /* synthetic */ Ref$ObjectRef D;
        public final /* synthetic */ Ref$ObjectRef E;
        public final /* synthetic */ Ref$ObjectRef F;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58397r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58398s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58399t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58400u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58401v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58402w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58403x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58404y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58405z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$ObjectRef ref$ObjectRef9, Ref$ObjectRef ref$ObjectRef10, Ref$ObjectRef ref$ObjectRef11, Ref$ObjectRef ref$ObjectRef12) {
            super(2, continuation);
            this.f58399t = xmlPullParser;
            this.f58400u = ref$ObjectRef;
            this.f58401v = ref$ObjectRef2;
            this.f58402w = ref$ObjectRef3;
            this.f58403x = ref$ObjectRef4;
            this.f58404y = ref$ObjectRef5;
            this.f58405z = ref$ObjectRef6;
            this.A = ref$ObjectRef7;
            this.B = ref$ObjectRef8;
            this.C = ref$ObjectRef9;
            this.D = ref$ObjectRef10;
            this.E = ref$ObjectRef11;
            this.F = ref$ObjectRef12;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f58399t, continuation, this.f58400u, this.f58401v, this.f58402w, this.f58403x, this.f58404y, this.f58405z, this.A, this.B, this.C, this.D, this.E, this.F);
            dVar.f58398s = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58397r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58398s);
            if (w.n0(this.f58399t)) {
                this.f58399t.nextTag();
            }
            if (w.i0(this.f58399t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58399t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58399t.getDepth();
            while (this.f58399t.getDepth() >= depth) {
                int depth2 = this.f58399t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58399t);
                    }
                } else if (w.p0(this.f58399t)) {
                    XmlPullParser xmlPullParser = this.f58399t;
                    this.f58400u.f93280b = w.G(xmlPullParser, "id");
                    this.f58401v.f93280b = kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual(w.G(xmlPullParser, "delivery"), "progressive"));
                    this.f58402w.f93280b = w.G(xmlPullParser, "type");
                    Ref$ObjectRef ref$ObjectRef = this.f58403x;
                    String strG = w.G(xmlPullParser, "width");
                    ref$ObjectRef.f93280b = strG != null ? StringsKt.toIntOrNull(strG) : null;
                    Ref$ObjectRef ref$ObjectRef2 = this.f58404y;
                    String strG2 = w.G(xmlPullParser, "height");
                    ref$ObjectRef2.f93280b = strG2 != null ? StringsKt.toIntOrNull(strG2) : null;
                    this.f58405z.f93280b = w.G(xmlPullParser, "codec");
                    Ref$ObjectRef ref$ObjectRef3 = this.A;
                    String strG3 = w.G(xmlPullParser, com.taurusx.tax.f.a.f65992s);
                    ref$ObjectRef3.f93280b = strG3 != null ? StringsKt.toIntOrNull(strG3) : null;
                    Ref$ObjectRef ref$ObjectRef4 = this.B;
                    String strG4 = w.G(xmlPullParser, com.taurusx.tax.f.a.f65988a);
                    ref$ObjectRef4.f93280b = strG4 != null ? StringsKt.toIntOrNull(strG4) : null;
                    Ref$ObjectRef ref$ObjectRef5 = this.C;
                    String strG5 = w.G(xmlPullParser, com.taurusx.tax.f.a.f65990n);
                    ref$ObjectRef5.f93280b = strG5 != null ? StringsKt.toIntOrNull(strG5) : null;
                    Ref$ObjectRef ref$ObjectRef6 = this.D;
                    String strG6 = w.G(xmlPullParser, "scalable");
                    ref$ObjectRef6.f93280b = strG6 != null ? kotlin.coroutines.jvm.internal.b.a(Boolean.parseBoolean(strG6)) : null;
                    this.E.f93280b = w.G(xmlPullParser, "apiFramework");
                } else if (w.r0(this.f58399t) && (text = this.f58399t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58399t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.F.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58399t)) {
                    return Unit.f93236a;
                }
                this.f58399t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class d0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58406r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58407s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58408t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58409u;

        public d0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58408t = obj;
            this.f58409u |= Integer.MIN_VALUE;
            return w.H0(null, this);
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.d {
        public Object A;
        public Object B;
        public Object C;
        public /* synthetic */ Object D;
        public int E;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58410r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58411s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58412t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58413u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58414v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58415w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58416x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58417y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f58418z;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.D = obj;
            this.E |= Integer.MIN_VALUE;
            return w.l(null, this);
        }
    }

    public static final class e0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58419r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58420s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58421t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58422u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58423v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58424w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58425x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2, continuation);
            this.f58422u = xmlPullParser;
            this.f58423v = ref$ObjectRef;
            this.f58424w = ref$ObjectRef2;
            this.f58425x = ref$ObjectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            e0 e0Var = new e0(this.f58422u, continuation, this.f58423v, this.f58424w, this.f58425x);
            e0Var.f58421t = obj;
            return e0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
        
            if (r9 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00c4, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006f -> B:61:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:61:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:61:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b6 -> B:41:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cf -> B:61:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00fb -> B:61:0x0119). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0114 -> B:61:0x0119). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58426r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58427s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58428t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58429u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f58430v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.f58429u = xmlPullParser;
            this.f58430v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.f58429u, continuation, this.f58430v);
            fVar.f58428t = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0072 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:31:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008f -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a9 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c2 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58431r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58432s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58433t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f58434u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f58435v;

        public f0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58434u = obj;
            this.f58435v |= Integer.MIN_VALUE;
            return w.a(null, this);
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58436r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58437s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58438t;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58437s = obj;
            this.f58438t |= Integer.MIN_VALUE;
            return w.m(null, this);
        }
    }

    public static final class g0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58439r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58440s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58441t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58442u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f58443v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.f58442u = xmlPullParser;
            this.f58443v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            g0 g0Var = new g0(this.f58442u, continuation, this.f58443v);
            g0Var.f58441t = obj;
            return g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0072 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:31:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008f -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a9 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c2 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58444r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58445s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58446t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58447u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58448v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.f58446t = xmlPullParser;
            this.f58447u = ref$ObjectRef;
            this.f58448v = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            h hVar = new h(this.f58446t, continuation, this.f58447u, this.f58448v);
            hVar.f58445s = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58444r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58445s);
            if (w.n0(this.f58446t)) {
                this.f58446t.nextTag();
            }
            if (w.i0(this.f58446t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58446t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58446t.getDepth();
            while (this.f58446t.getDepth() >= depth) {
                int depth2 = this.f58446t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58446t);
                    }
                } else if (w.p0(this.f58446t)) {
                    XmlPullParser xmlPullParser = this.f58446t;
                    this.f58447u.f93280b = w.G(xmlPullParser, "model");
                    this.f58448v.f93280b = w.G(xmlPullParser, "currency");
                } else if (w.r0(this.f58446t) && (text = this.f58446t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58446t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58446t)) {
                    return Unit.f93236a;
                }
                this.f58446t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class h0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58449r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58450s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58451t;

        public h0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58450s = obj;
            this.f58451t |= Integer.MIN_VALUE;
            return w.b(null, this);
        }
    }

    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58452r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58453s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58454t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58455u;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58454t = obj;
            this.f58455u |= Integer.MIN_VALUE;
            return w.n(null, this);
        }
    }

    public static final class i0 extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ Ref$ObjectRef A;
        public final /* synthetic */ List B;
        public final /* synthetic */ Ref$ObjectRef C;
        public final /* synthetic */ List D;
        public final /* synthetic */ List E;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58456r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58457s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58458t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58459u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58460v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58461w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58462x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58463y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58464z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, List list, Ref$ObjectRef ref$ObjectRef7, List list2, List list3) {
            super(2, continuation);
            this.f58459u = xmlPullParser;
            this.f58460v = ref$ObjectRef;
            this.f58461w = ref$ObjectRef2;
            this.f58462x = ref$ObjectRef3;
            this.f58463y = ref$ObjectRef4;
            this.f58464z = ref$ObjectRef5;
            this.A = ref$ObjectRef6;
            this.B = list;
            this.C = ref$ObjectRef7;
            this.D = list2;
            this.E = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            i0 i0Var = new i0(this.f58459u, continuation, this.f58460v, this.f58461w, this.f58462x, this.f58463y, this.f58464z, this.A, this.B, this.C, this.D, this.E);
            i0Var.f58458t = obj;
            return i0Var;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x026d, code lost:
        
            r3.f93280b = null;
            r7.f58463y.f93280b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.G(r8, "apiFramework");
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01c6, code lost:
        
            if (r8 == r0) goto L106;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01cd -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01df -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x024f -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0268 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00af -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b5 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c0 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d5 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d7 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e9 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f9 -> B:53:0x00fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x010e -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x012d -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0141 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0143 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0155 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x018e -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0199 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01b7 -> B:130:0x026d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cb -> B:130:0x026d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 696
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58465r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58466s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58467t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58468u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58469v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.f58467t = xmlPullParser;
            this.f58468u = ref$ObjectRef;
            this.f58469v = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f58467t, continuation, this.f58468u, this.f58469v);
            jVar.f58466s = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58465r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58466s);
            if (w.n0(this.f58467t)) {
                this.f58467t.nextTag();
            }
            if (w.i0(this.f58467t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58467t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58467t.getDepth();
            while (this.f58467t.getDepth() >= depth) {
                int depth2 = this.f58467t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58467t);
                    }
                } else if (w.p0(this.f58467t)) {
                    XmlPullParser xmlPullParser = this.f58467t;
                    Ref$ObjectRef ref$ObjectRef = this.f58468u;
                    String strG = w.G(xmlPullParser, "creativeType");
                    ref$ObjectRef.f93280b = strG != null ? w.R(strG) : null;
                } else if (w.r0(this.f58467t) && (text = this.f58467t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58467t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58469v.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58467t)) {
                    return Unit.f93236a;
                }
                this.f58467t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class j0 extends kotlin.coroutines.jvm.internal.d {
        public Object A;
        public /* synthetic */ Object B;
        public int C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58470r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58471s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58472t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58473u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58474v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58475w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58476x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58477y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f58478z;

        public j0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return w.c(null, this);
        }
    }

    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58479r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58480s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58481t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58482u;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58481t = obj;
            this.f58482u |= Integer.MIN_VALUE;
            return w.o(null, this);
        }
    }

    public static final class k0 extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ boolean A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58483r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58484s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58485t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58486u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58487v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58488w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58489x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58490y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58491z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, boolean z10) {
            super(2, continuation);
            this.f58486u = xmlPullParser;
            this.f58487v = ref$ObjectRef;
            this.f58488w = ref$ObjectRef2;
            this.f58489x = ref$ObjectRef3;
            this.f58490y = ref$ObjectRef4;
            this.f58491z = ref$ObjectRef5;
            this.A = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            k0 k0Var = new k0(this.f58486u, continuation, this.f58487v, this.f58488w, this.f58489x, this.f58490y, this.f58491z, this.A);
            k0Var.f58485t = obj;
            return k0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
        
            if (r9 == r0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[PHI: r1 r5
  0x00d2: PHI (r1v2 int) = (r1v3 int), (r1v4 int), (r1v7 int) binds: [B:36:0x00a0, B:39:0x00ae, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r5v0 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r5v1 kotlin.jvm.internal.Ref$ObjectRef)
  (r5v7 kotlin.jvm.internal.Ref$ObjectRef)
  (r5v9 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:36:0x00a0, B:39:0x00ae, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006f -> B:67:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:67:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:67:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a2 -> B:51:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ba -> B:43:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d2 -> B:51:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00de -> B:67:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x011e -> B:67:0x013c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0137 -> B:67:0x013c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58492r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58493s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58494t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58495u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.f58494t = xmlPullParser;
            this.f58495u = ref$ObjectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            l lVar = new l(this.f58494t, continuation, this.f58495u);
            lVar.f58493s = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58492r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58493s);
            if (w.n0(this.f58494t)) {
                this.f58494t.nextTag();
            }
            if (w.i0(this.f58494t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58494t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58494t.getDepth();
            while (this.f58494t.getDepth() >= depth) {
                int depth2 = this.f58494t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58494t);
                    }
                } else if (w.p0(this.f58494t)) {
                    continue;
                } else if (w.r0(this.f58494t) && (text = this.f58494t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58494t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58495u.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58494t)) {
                    return Unit.f93236a;
                }
                this.f58494t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class l0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58496r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58497s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58498t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58499u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58500v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f58501w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f58502x;

        public l0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58501w = obj;
            this.f58502x |= Integer.MIN_VALUE;
            return w.T(null, false, this);
        }
    }

    public static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58503r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58504s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58505t;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58504s = obj;
            this.f58505t |= Integer.MIN_VALUE;
            return w.p(null, this);
        }
    }

    public static final class m0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58506r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58507s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58508t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58509u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f58510v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List f58511w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(XmlPullParser xmlPullParser, Continuation continuation, boolean z10, List list) {
            super(2, continuation);
            this.f58509u = xmlPullParser;
            this.f58510v = z10;
            this.f58511w = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            m0 m0Var = new m0(this.f58509u, continuation, this.f58510v, this.f58511w);
            m0Var.f58508t = obj;
            return m0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:49:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:49:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0073 -> B:49:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:31:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:49:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ac -> B:49:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c5 -> B:49:0x00ca). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class n extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58512r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58513s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58514t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58515u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f58516v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.f58515u = xmlPullParser;
            this.f58516v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f58515u, continuation, this.f58516v);
            nVar.f58514t = obj;
            return nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0072 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:31:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008f -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a9 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c2 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class n0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58517r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58518s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58519t;

        public n0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58518s = obj;
            this.f58519t |= Integer.MIN_VALUE;
            return w.Z(null, false, this);
        }
    }

    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58520r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58521s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58522t;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58521s = obj;
            this.f58522t |= Integer.MIN_VALUE;
            return w.q(null, this);
        }
    }

    public static final class o0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f58523r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58524s;

        public o0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58523r = obj;
            this.f58524s |= Integer.MIN_VALUE;
            return w.e(null, this);
        }
    }

    public static final class p extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58525r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58526s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58527t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58528u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58529v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58530w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2, continuation);
            this.f58527t = xmlPullParser;
            this.f58528u = ref$ObjectRef;
            this.f58529v = ref$ObjectRef2;
            this.f58530w = ref$ObjectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            p pVar = new p(this.f58527t, continuation, this.f58528u, this.f58529v, this.f58530w);
            pVar.f58526s = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58525r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58526s);
            if (w.n0(this.f58527t)) {
                this.f58527t.nextTag();
            }
            if (w.i0(this.f58527t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58527t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58527t.getDepth();
            while (this.f58527t.getDepth() >= depth) {
                int depth2 = this.f58527t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58527t);
                    }
                } else if (w.p0(this.f58527t)) {
                    XmlPullParser xmlPullParser = this.f58527t;
                    Ref$ObjectRef ref$ObjectRef = this.f58528u;
                    String strG = w.G(xmlPullParser, "event");
                    ref$ObjectRef.f93280b = strG != null ? w.j0(strG) : null;
                    Ref$ObjectRef ref$ObjectRef2 = this.f58529v;
                    String strG2 = w.G(xmlPullParser, "offset");
                    ref$ObjectRef2.f93280b = strG2 != null ? w.b0(strG2) : null;
                } else if (w.r0(this.f58527t) && (text = this.f58527t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58527t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58530w.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58527t)) {
                    return Unit.f93236a;
                }
                this.f58527t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class p0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f58531r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58532s;

        public p0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58531r = obj;
            this.f58532s |= Integer.MIN_VALUE;
            return w.f(null, this);
        }
    }

    public static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58533r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58534s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58535t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f58536u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f58537v;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58536u = obj;
            this.f58537v |= Integer.MIN_VALUE;
            return w.r(null, this);
        }
    }

    public static final class q0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58538r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58539s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58540t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58541u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58542v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List f58543w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, List list) {
            super(2, continuation);
            this.f58541u = xmlPullParser;
            this.f58542v = ref$ObjectRef;
            this.f58543w = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            q0 q0Var = new q0(this.f58541u, continuation, this.f58542v, this.f58543w);
            q0Var.f58540t = obj;
            return q0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        
            if (r7 == r0) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:57:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0073 -> B:57:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009b -> B:57:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a8 -> B:39:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bb -> B:57:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d5 -> B:57:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00ee -> B:57:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.q0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class r extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58545s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(XmlPullParser xmlPullParser, Continuation continuation) {
            super(2, continuation);
            this.f58545s = xmlPullParser;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.f58545s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58544r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            XmlPullParser xmlPullParser = this.f58545s;
            this.f58544r = 1;
            Object objT = w.t(xmlPullParser, this);
            return objT == objG ? objG : objT;
        }
    }

    public static final class r0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58546r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58547s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58548t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58549u;

        public r0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58548t = obj;
            this.f58549u |= Integer.MIN_VALUE;
            return w.g(null, this);
        }
    }

    public static final class s extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58550r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58551s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58552t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58553u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58554v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58555w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ List f58556x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, List list) {
            super(2, continuation);
            this.f58553u = xmlPullParser;
            this.f58554v = ref$ObjectRef;
            this.f58555w = ref$ObjectRef2;
            this.f58556x = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            s sVar = new s(this.f58553u, continuation, this.f58554v, this.f58555w, this.f58556x);
            sVar.f58552t = obj;
            return sVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        
            if (r7 == r0) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:57:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0073 -> B:57:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009b -> B:57:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a8 -> B:39:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bd -> B:57:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e1 -> B:57:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00fa -> B:57:0x00ff). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class s0 extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ Ref$ObjectRef A;
        public final /* synthetic */ Ref$ObjectRef B;
        public final /* synthetic */ Ref$ObjectRef C;
        public final /* synthetic */ List D;
        public Object E;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58557r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58558s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58559t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58560u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58561v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58562w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58563x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58564y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58565z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, List list) {
            super(2, continuation);
            this.f58560u = xmlPullParser;
            this.f58561v = ref$ObjectRef;
            this.f58562w = ref$ObjectRef2;
            this.f58563x = ref$ObjectRef3;
            this.f58564y = ref$ObjectRef4;
            this.f58565z = ref$ObjectRef5;
            this.A = ref$ObjectRef6;
            this.B = ref$ObjectRef7;
            this.C = ref$ObjectRef8;
            this.D = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            s0 s0Var = new s0(this.f58560u, continuation, this.f58561v, this.f58562w, this.f58563x, this.f58564y, this.f58565z, this.A, this.B, this.C, this.D);
            s0Var.f58559t = obj;
            return s0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x016e, code lost:
        
            if (r13 == r0) goto L83;
         */
        /* JADX WARN: Removed duplicated region for block: B:119:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0136 A[PHI: r1 r8 r9
  0x0136: PHI (r1v3 int) = (r1v4 int), (r1v5 int), (r1v7 int), (r1v8 int), (r1v8 int), (r1v8 int), (r1v8 int), (r1v8 int) binds: [B:69:0x012e, B:60:0x010c, B:52:0x00eb, B:37:0x00b9, B:63:0x011a, B:55:0x00f9, B:43:0x00cc, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r8v4 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r8v5 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v6 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v8 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v16 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v16 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v16 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v16 kotlin.jvm.internal.Ref$ObjectRef)
  (r8v16 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:69:0x012e, B:60:0x010c, B:52:0x00eb, B:37:0x00b9, B:63:0x011a, B:55:0x00f9, B:43:0x00cc, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r9v1 org.xmlpull.v1.XmlPullParser) = 
  (r9v2 org.xmlpull.v1.XmlPullParser)
  (r9v3 org.xmlpull.v1.XmlPullParser)
  (r9v5 org.xmlpull.v1.XmlPullParser)
  (r9v26 org.xmlpull.v1.XmlPullParser)
  (r9v26 org.xmlpull.v1.XmlPullParser)
  (r9v26 org.xmlpull.v1.XmlPullParser)
  (r9v26 org.xmlpull.v1.XmlPullParser)
  (r9v26 org.xmlpull.v1.XmlPullParser)
 binds: [B:69:0x012e, B:60:0x010c, B:52:0x00eb, B:37:0x00b9, B:63:0x011a, B:55:0x00f9, B:43:0x00cc, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01fa -> B:118:0x0218). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0213 -> B:118:0x0218). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a1 -> B:118:0x0218). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:118:0x0218). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0160 -> B:118:0x0218). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x016e -> B:84:0x0171). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 554
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.s0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58566r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58567s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58568t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f58569u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f58570v;

        public t(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58569u = obj;
            this.f58570v |= Integer.MIN_VALUE;
            return w.t(null, this);
        }
    }

    public static final class t0 extends kotlin.coroutines.jvm.internal.d {
        public /* synthetic */ Object A;
        public int B;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58571r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58572s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58573t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58574u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58575v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58576w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58577x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58578y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f58579z;

        public t0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return w.h(null, this);
        }
    }

    public static final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58580r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58581s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58582t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58583u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58584v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.f58582t = xmlPullParser;
            this.f58583u = ref$ObjectRef;
            this.f58584v = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            u uVar = new u(this.f58582t, continuation, this.f58583u, this.f58584v);
            uVar.f58581s = obj;
            return uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58580r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58581s);
            if (w.n0(this.f58582t)) {
                this.f58582t.nextTag();
            }
            if (w.i0(this.f58582t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58582t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58582t.getDepth();
            while (this.f58582t.getDepth() >= depth) {
                int depth2 = this.f58582t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58582t);
                    }
                } else if (w.p0(this.f58582t)) {
                    this.f58583u.f93280b = w.G(this.f58582t, "id");
                } else if (w.r0(this.f58582t) && (text = this.f58582t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58582t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58584v.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58582t)) {
                    return Unit.f93236a;
                }
                this.f58582t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class u0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58585r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58586s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58587t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58588u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List f58589v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(XmlPullParser xmlPullParser, Continuation continuation, List list) {
            super(2, continuation);
            this.f58588u = xmlPullParser;
            this.f58589v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            u0 u0Var = new u0(this.f58588u, continuation, this.f58589v);
            u0Var.f58587t = obj;
            return u0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0072 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:31:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008f -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a9 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c2 -> B:49:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.u0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58590r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58591s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58592t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58593u;

        public v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58592t = obj;
            this.f58593u |= Integer.MIN_VALUE;
            return w.u(null, this);
        }
    }

    public static final class v0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58594r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58595s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58596t;

        public v0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58595s = obj;
            this.f58596t |= Integer.MIN_VALUE;
            return w.i(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$w, reason: collision with other inner class name */
    public static final class C0772w extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58597r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58598s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58599t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58600u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58601v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List f58602w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ List f58603x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0772w(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, List list, List list2) {
            super(2, continuation);
            this.f58600u = xmlPullParser;
            this.f58601v = ref$ObjectRef;
            this.f58602w = list;
            this.f58603x = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0772w) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C0772w c0772w = new C0772w(this.f58600u, continuation, this.f58601v, this.f58602w, this.f58603x);
            c0772w.f58599t = obj;
            return c0772w;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        
            if (r10 == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
        
            if (r10 == r0) goto L62;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0074 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0086 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009a -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a4 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00b9 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c6 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d4 -> B:54:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00e7 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0102 -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x011c -> B:79:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0135 -> B:79:0x013a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.C0772w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class w0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58604r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58605s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58606t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58607u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58608v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, continuation);
            this.f58606t = xmlPullParser;
            this.f58607u = ref$ObjectRef;
            this.f58608v = ref$ObjectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            w0 w0Var = new w0(this.f58606t, continuation, this.f58607u, this.f58608v);
            w0Var.f58605s = obj;
            return w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            pf.b.g();
            if (this.f58604r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            kotlinx.coroutines.i.h((CoroutineScope) this.f58605s);
            if (w.n0(this.f58606t)) {
                this.f58606t.nextTag();
            }
            if (w.i0(this.f58606t)) {
                return Unit.f93236a;
            }
            if (!w.p0(this.f58606t)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f58606t.getDepth();
            while (this.f58606t.getDepth() >= depth) {
                int depth2 = this.f58606t.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        w.p0(this.f58606t);
                    }
                } else if (w.p0(this.f58606t)) {
                    this.f58607u.f93280b = w.G(this.f58606t, "id");
                } else if (w.r0(this.f58606t) && (text = this.f58606t.getText()) != null && !StringsKt.y0(text)) {
                    String text2 = this.f58606t.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f58608v.f93280b = StringsKt.v1(text2).toString();
                } else if (w.l0(this.f58606t)) {
                    return Unit.f93236a;
                }
                this.f58606t.next();
            }
            return Unit.f93236a;
        }
    }

    public static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f58609r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58610s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58611t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58612u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f58613v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f58614w;

        public x(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58613v = obj;
            this.f58614w |= Integer.MIN_VALUE;
            return w.h0(null, false, this);
        }
    }

    public static final class x0 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58615r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58616s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58617t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58618u;

        public x0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58617t = obj;
            this.f58618u |= Integer.MIN_VALUE;
            return w.j(null, this);
        }
    }

    public static final class y extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ List A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58619r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58620s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58621t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58622u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58623v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58624w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58625x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ List f58626y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ List f58627z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, List list, List list2, List list3) {
            super(2, continuation);
            this.f58622u = xmlPullParser;
            this.f58623v = ref$ObjectRef;
            this.f58624w = ref$ObjectRef2;
            this.f58625x = ref$ObjectRef3;
            this.f58626y = list;
            this.f58627z = list2;
            this.A = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            y yVar = new y(this.f58622u, continuation, this.f58623v, this.f58624w, this.f58625x, this.f58626y, this.f58627z, this.A);
            yVar.f58621t = obj;
            return yVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x019c, code lost:
        
            r8.f93280b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        
            if (r11 == r0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
        
            if (r11 == r0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
        
            if (r11 == r0) goto L76;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01a3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0097 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a5 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b0 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c4 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00c6 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d3 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e6 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e8 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00f5 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0112 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x012f -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x013d -> B:77:0x0140). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x017e -> B:96:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0197 -> B:96:0x019c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class y0 extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ List A;
        public final /* synthetic */ List B;
        public final /* synthetic */ List C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58628r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58629s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58630t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f58631u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58632v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58633w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58634x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58635y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58636z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(XmlPullParser xmlPullParser, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, List list, List list2, List list3) {
            super(2, continuation);
            this.f58631u = xmlPullParser;
            this.f58632v = ref$ObjectRef;
            this.f58633w = ref$ObjectRef2;
            this.f58634x = ref$ObjectRef3;
            this.f58635y = ref$ObjectRef4;
            this.f58636z = ref$ObjectRef5;
            this.A = list;
            this.B = list2;
            this.C = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y0) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            y0 y0Var = new y0(this.f58631u, continuation, this.f58632v, this.f58633w, this.f58634x, this.f58635y, this.f58636z, this.A, this.B, this.C);
            y0Var.f58630t = obj;
            return y0Var;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
        
            if (r7 == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0154, code lost:
        
            if (r7 == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01b2, code lost:
        
            if (r7 == r0) goto L97;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01c3 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01dd -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x01f6 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a0 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00aa -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b2 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b9 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c4 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d9 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e8 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0107 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0126 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0145 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0159 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x015b -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0168 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0186 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01a3 -> B:114:0x01fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b2 -> B:98:0x01b5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 582
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.y0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class z extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58637r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58638s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58639t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58640u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58641v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58642w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f58643x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f58644y;

        public z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58643x = obj;
            this.f58644y |= Integer.MIN_VALUE;
            return w.v(null, this);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.t C() {
        return I();
    }

    public static final String G(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || StringsKt.y0(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G0(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.b0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$b0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.b0) r0
            int r1 = r0.f58382u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58382u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$b0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$b0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58381t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58382u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58380s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f58379r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$a0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$a0
            r5.<init>(r6, r3, r2, r7)
            r0.f58379r = r7
            r0.f58380s = r2
            r0.f58382u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r7 = r0.f93280b
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e
            java.lang.Object r6 = r6.f93280b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r0.<init>(r7, r6)
            return r0
        L6b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.G0(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H0(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.d0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$d0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.d0) r0
            int r1 = r0.f58409u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58409u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$d0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58408t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58409u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58407s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f58406r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$c0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$c0
            r5.<init>(r6, r3, r2, r7)
            r0.f58406r = r7
            r0.f58407s = r2
            r0.f58409u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r7 = r0.f93280b
            if (r7 != 0) goto L64
            java.lang.Object r7 = r6.f93280b
            if (r7 != 0) goto L64
            return r3
        L64:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f
            java.lang.Object r0 = r0.f93280b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.f93280b
            java.lang.String r6 = (java.lang.String) r6
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.H0(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u I() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u) f58354a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k R(String str) {
        if (StringsKt.Y(str, "image/", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57578b;
        }
        if (StringsKt.e0(str, "javascript", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57579c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object T(org.xmlpull.v1.XmlPullParser r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.l0
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$l0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.l0) r0
            int r1 = r0.f58502x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58502x = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$l0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$l0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f58501w
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58502x
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r13 = r0.f58500v
            kotlin.jvm.internal.Ref$ObjectRef r13 = (kotlin.jvm.internal.Ref$ObjectRef) r13
            java.lang.Object r14 = r0.f58499u
            kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref$ObjectRef) r14
            java.lang.Object r1 = r0.f58498t
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r2 = r0.f58497s
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r0 = r0.f58496r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r15)
            goto L81
        L3d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L45:
            kotlin.d.b(r15)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$k0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$k0
            r6 = 0
            r5 = r13
            r12 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f58496r = r7
            r0.f58497s = r8
            r0.f58498t = r9
            r0.f58499u = r10
            r0.f58500v = r11
            r0.f58502x = r3
            java.lang.Object r13 = kotlinx.coroutines.i.g(r4, r0)
            if (r13 != r1) goto L7c
            return r1
        L7c:
            r0 = r7
            r2 = r8
            r1 = r9
            r14 = r10
            r13 = r11
        L81:
            java.lang.Object r13 = r13.f93280b
            r8 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) r8
            if (r8 == 0) goto La2
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i
            java.lang.Object r13 = r0.f93280b
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.f93280b
            r5 = r13
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r13 = r1.f93280b
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r13 = r14.f93280b
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        La2:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.T(org.xmlpull.v1.XmlPullParser, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final SimpleDateFormat U() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n.b("HH:mm:ss.SSS");
    }

    public static final Long X(String str) {
        Object objB;
        Object objB2;
        try {
            Result.Companion companion = Result.f93230c;
            Date date = U().parse(str);
            objB = Result.b(date != null ? Long.valueOf(date.getTime()) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Long l10 = (Long) objB;
        if (l10 != null) {
            return l10;
        }
        try {
            Date date2 = a0().parse(str);
            objB2 = Result.b(date2 != null ? Long.valueOf(date2.getTime()) : null);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.f93230c;
            objB2 = Result.b(kotlin.d.a(th3));
        }
        return (Long) (Result.i(objB2) ? null : objB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Z(org.xmlpull.v1.XmlPullParser r5, boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.n0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$n0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.n0) r0
            int r1 = r0.f58519t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58519t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$n0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$n0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58518s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58519t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f58517r
            java.util.List r5 = (java.util.List) r5
            kotlin.d.b(r7)
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$m0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$m0
            r4 = 0
            r2.<init>(r5, r4, r6, r7)
            r0.f58517r = r7
            r0.f58519t = r3
            java.lang.Object r5 = kotlinx.coroutines.i.g(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.Z(org.xmlpull.v1.XmlPullParser, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(org.xmlpull.v1.XmlPullParser r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.f0
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$f0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.f0) r0
            int r1 = r0.f58435v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58435v = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$f0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$f0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f58434u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58435v
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r10 = r0.f58433t
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r1 = r0.f58432s
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f58431r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r11)
            goto L68
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            kotlin.d.b(r11)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$e0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$e0
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f58431r = r7
            r0.f58432s = r8
            r0.f58433t = r9
            r0.f58435v = r3
            java.lang.Object r10 = kotlinx.coroutines.i.g(r4, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r0 = r7
            r1 = r8
            r10 = r9
        L68:
            java.lang.Object r10 = r10.f93280b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d r10 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) r10
            if (r10 == 0) goto L7c
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c
            java.lang.Object r0 = r0.f93280b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.f93280b
            java.lang.Integer r1 = (java.lang.Integer) r1
            r11.<init>(r0, r1, r10)
            return r11
        L7c:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.a(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final SimpleDateFormat a0() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n.b("HH:mm:ss");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(org.xmlpull.v1.XmlPullParser r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.h0
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$h0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.h0) r0
            int r1 = r0.f58451t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58451t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$h0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$h0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58450s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58451t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f58449r
            java.util.List r5 = (java.util.List) r5
            kotlin.d.b(r6)
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$g0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$g0
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f58449r = r6
            r0.f58451t = r3
            java.lang.Object r5 = kotlinx.coroutines.i.g(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.b(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t b0(String str) {
        Long lX = X(str);
        if (lX != null) {
            return new t.b(lX.longValue());
        }
        Integer numF0 = f0(str);
        if (numF0 != null) {
            return new t.a(numF0.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(org.xmlpull.v1.XmlPullParser r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.c(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object d(XmlPullParser xmlPullParser, Continuation continuation) {
        return p(xmlPullParser, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(org.xmlpull.v1.XmlPullParser r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.o0
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$o0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.o0) r0
            int r1 = r0.f58524s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58524s = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$o0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$o0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f58523r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58524s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r5)
            r0.f58524s = r3
            java.lang.Object r5 = p(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L47
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l
            r4.<init>(r5)
            return r4
        L47:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.e(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e0(org.xmlpull.v1.XmlPullParser r16, boolean r17, kotlin.coroutines.Continuation r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.c
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$c r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.c) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$c r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f58391z
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.A
            r4 = 1
            if (r3 == 0) goto L55
            if (r3 != r4) goto L4d
            boolean r2 = r1.f58383r
            java.lang.Object r3 = r1.f58390y
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.f58389x
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r1.f58388w
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.f58387v
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.f58386u
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r1.f58385t
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r1 = r1.f58384s
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.d.b(r0)
            r14 = r2
            r9 = r3
            r10 = r7
            r7 = r5
            goto La4
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L55:
            kotlin.d.b(r0)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$b r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$b
            r7 = 0
            r6 = r16
            r14 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f58384s = r8
            r1.f58385t = r9
            r1.f58386u = r10
            r1.f58387v = r11
            r1.f58388w = r12
            r1.f58389x = r13
            r1.f58390y = r15
            r1.f58383r = r14
            r1.A = r4
            java.lang.Object r0 = kotlinx.coroutines.i.g(r5, r1)
            if (r0 != r2) goto L9e
            return r2
        L9e:
            r1 = r8
            r8 = r9
            r6 = r11
            r7 = r12
            r4 = r13
            r9 = r15
        La4:
            if (r14 == 0) goto Lae
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lae
            r0 = 0
            return r0
        Lae:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r
            java.lang.Object r0 = r1.f93280b
            r3 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) r3
            java.lang.Object r0 = r8.f93280b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) r0
            java.lang.Object r1 = r10.f93280b
            r5 = r1
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r1 = r4.f93280b
            r8 = r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a) r8
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.e0(org.xmlpull.v1.XmlPullParser, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(org.xmlpull.v1.XmlPullParser r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.p0
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$p0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.p0) r0
            int r1 = r0.f58532s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58532s = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$p0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$p0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f58531r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58532s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r5)
            r0.f58532s = r3
            java.lang.Object r5 = p(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L47
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m
            r4.<init>(r5)
            return r4
        L47:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.f(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Integer f0(java.lang.String r3) {
        /*
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L1f
            java.text.NumberFormat r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.f58355b     // Catch: java.lang.Throwable -> L1f
            java.lang.Number r3 = r1.parse(r3)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L21
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L1f
            r1 = 100
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L1f
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            if (r3 < 0) goto L21
            r2 = 101(0x65, float:1.42E-43)
            if (r3 >= r2) goto L21
            goto L22
        L1f:
            r3 = move-exception
            goto L27
        L21:
            r1 = r0
        L22:
            java.lang.Object r3 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L1f
            goto L31
        L27:
            kotlin.Result$Companion r1 = kotlin.Result.f93230c
            java.lang.Object r3 = kotlin.d.a(r3)
            java.lang.Object r3 = kotlin.Result.b(r3)
        L31:
            boolean r1 = kotlin.Result.i(r3)
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r3
        L39:
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.f0(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.r0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$r0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.r0) r0
            int r1 = r0.f58549u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58549u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$r0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$r0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58548t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58549u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58547s
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.f58546r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$q0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$q0
            r5.<init>(r6, r3, r7, r2)
            r0.f58546r = r7
            r0.f58547s = r2
            r0.f58549u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r7 = r0.f93280b
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L67
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o
            r0.<init>(r7, r6)
            return r0
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.g(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(org.xmlpull.v1.XmlPullParser r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.h(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h0(org.xmlpull.v1.XmlPullParser r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.x
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$x r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.x) r0
            int r1 = r0.f58614w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58614w = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$x r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$x
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f58613v
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58614w
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r11 = r0.f58609r
            java.lang.Object r10 = r0.f58612u
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.f58611t
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f58610s
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r12)
            goto L6c
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            kotlin.d.b(r12)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$w r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$w
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f58610s = r7
            r0.f58611t = r8
            r0.f58612u = r9
            r0.f58609r = r11
            r0.f58614w = r3
            java.lang.Object r10 = kotlinx.coroutines.i.g(r4, r0)
            if (r10 != r1) goto L69
            return r1
        L69:
            r0 = r7
            r1 = r8
            r10 = r9
        L6c:
            if (r11 == 0) goto L74
            java.lang.Object r11 = r0.f93280b
            if (r11 != 0) goto L74
            r10 = 0
            return r10
        L74:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a
            java.lang.Object r12 = r0.f93280b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 r12 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) r12
            r11.<init>(r12, r1, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.h0(org.xmlpull.v1.XmlPullParser, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(org.xmlpull.v1.XmlPullParser r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.v0
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$v0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.v0) r0
            int r1 = r0.f58596t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58596t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$v0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$v0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58595s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58596t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f58594r
            java.util.List r5 = (java.util.List) r5
            kotlin.d.b(r6)
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$u0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$u0
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f58594r = r6
            r0.f58596t = r3
            java.lang.Object r5 = kotlinx.coroutines.i.g(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.i(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean i0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.x0
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$x0 r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.x0) r0
            int r1 = r0.f58618u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58618u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$x0 r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$x0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58617t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58618u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58616s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f58615r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$w0 r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$w0
            r5.<init>(r6, r3, r7, r2)
            r0.f58615r = r7
            r0.f58616s = r2
            r0.f58618u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r6 = r6.f93280b
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p
            java.lang.Object r0 = r0.f93280b
            java.lang.String r0 = (java.lang.String) r0
            r7.<init>(r0, r6)
            return r7
        L6b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.j(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x j0(String str) {
        switch (str.hashCode()) {
            case -1638835128:
                if (str.equals("midpoint")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57636e;
                }
                return null;
            case -1337830390:
                if (str.equals("thirdQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57637f;
                }
                return null;
            case -1001078227:
                if (str.equals("progress")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57646o;
                }
                return null;
            case -934426579:
                if (str.equals("resume")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57643l;
                }
                return null;
            case -934318917:
                if (str.equals(EventConstants.REWIND)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57642k;
                }
                return null;
            case -840405966:
                if (str.equals("unmute")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57640i;
                }
                return null;
            case -599445191:
                if (str.equals("complete")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57638g;
                }
                return null;
            case -37683395:
                if (str.equals("closeLinear")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57644m;
                }
                return null;
            case 3363353:
                if (str.equals("mute")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57639h;
                }
                return null;
            case 3532159:
                if (str.equals("skip")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57645n;
                }
                return null;
            case 106440182:
                if (str.equals("pause")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57641j;
                }
                return null;
            case 109757538:
                if (str.equals("start")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57634c;
                }
                return null;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57635d;
                }
                return null;
            case 1778167540:
                if (str.equals("creativeView")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57633b;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(org.xmlpull.v1.XmlPullParser r16, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.k(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(org.xmlpull.v1.XmlPullParser r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.l(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean l0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(org.xmlpull.v1.XmlPullParser r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.g
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$g r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.g) r0
            int r1 = r0.f58438t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58438t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$g r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58437s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58438t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f58436r
            java.util.List r5 = (java.util.List) r5
            kotlin.d.b(r6)
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$f r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$f
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f58436r = r6
            r0.f58438t = r3
            java.lang.Object r5 = kotlinx.coroutines.i.g(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.m(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.i
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$i r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.i) r0
            int r1 = r0.f58455u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58455u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$i r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58454t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58455u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58453s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f58452r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$h r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$h
            r5.<init>(r6, r3, r7, r2)
            r0.f58452r = r7
            r0.f58453s = r2
            r0.f58455u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r7 = r0.f93280b
            if (r7 != 0) goto L64
            java.lang.Object r7 = r6.f93280b
            if (r7 != 0) goto L64
            return r3
        L64:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u
            java.lang.Object r0 = r0.f93280b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.f93280b
            java.lang.String r6 = (java.lang.String) r6
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.n(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean n0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.k
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$k r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.k) r0
            int r1 = r0.f58482u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58482u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$k r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58481t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58482u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58480s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f58479r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$j r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$j
            r5.<init>(r6, r3, r2, r7)
            r0.f58479r = r7
            r0.f58480s = r2
            r0.f58482u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r7 = r0.f93280b
            if (r7 == 0) goto L78
            java.lang.Object r7 = r6.f93280b
            if (r7 != 0) goto L64
            goto L78
        L64:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v
            java.lang.Object r0 = r0.f93280b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.f93280b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) r6
            r7.<init>(r0, r6)
            return r7
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.o(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(org.xmlpull.v1.XmlPullParser r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.m
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$m r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.m) r0
            int r1 = r0.f58505t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58505t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$m r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58504s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58505t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f58503r
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.d.b(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$l r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$l
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f58503r = r6
            r0.f58505t = r3
            java.lang.Object r5 = kotlinx.coroutines.i.g(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            java.lang.Object r5 = r5.f93280b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.p(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean p0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(org.xmlpull.v1.XmlPullParser r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.o
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$o r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.o) r0
            int r1 = r0.f58522t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58522t = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$o r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58521s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58522t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f58520r
            java.util.List r5 = (java.util.List) r5
            kotlin.d.b(r6)
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$n r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$n
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f58520r = r6
            r0.f58522t = r3
            java.lang.Object r5 = kotlinx.coroutines.i.g(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.q(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(org.xmlpull.v1.XmlPullParser r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.q
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$q r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.q) r0
            int r1 = r0.f58537v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58537v = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$q r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$q
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f58536u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58537v
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r10 = r0.f58535t
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r1 = r0.f58534s
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f58533r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r11)
            goto L68
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            kotlin.d.b(r11)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$p r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$p
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f58533r = r7
            r0.f58534s = r9
            r0.f58535t = r8
            r0.f58537v = r3
            java.lang.Object r10 = kotlinx.coroutines.i.g(r4, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r0 = r7
            r10 = r8
            r1 = r9
        L68:
            java.lang.Object r11 = r0.f93280b
            if (r11 == 0) goto L91
            java.lang.Object r2 = r1.f93280b
            if (r2 == 0) goto L91
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f57646o
            if (r11 != r2) goto L79
            java.lang.Object r11 = r10.f93280b
            if (r11 != 0) goto L79
            goto L91
        L79:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w
            java.lang.Object r0 = r0.f93280b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x) r0
            java.lang.Object r1 = r1.f93280b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r10 = r10.f93280b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r10 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) r10
            r11.<init>(r0, r1, r10)
            return r11
        L91:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.r(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean r0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 4;
    }

    public static final Object s(XmlPullParser xmlPullParser, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new r(xmlPullParser, null), continuation);
    }

    public static final Integer s0(XmlPullParser xmlPullParser) {
        String strG = G(xmlPullParser, com.taurusx.tax.f.w.f66047c);
        if (strG == null) {
            return null;
        }
        Integer intOrNull = StringsKt.toIntOrNull(strG);
        return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 999);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t(org.xmlpull.v1.XmlPullParser r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.t
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$t r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.t) r0
            int r1 = r0.f58570v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58570v = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$t r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$t
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f58569u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58570v
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r10 = r0.f58568t
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r1 = r0.f58567s
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f58566r
            java.util.List r0 = (java.util.List) r0
            kotlin.d.b(r11)
            goto L68
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            kotlin.d.b(r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$s r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$s
            r6 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f58566r = r9
            r0.f58567s = r7
            r0.f58568t = r8
            r0.f58570v = r3
            java.lang.Object r10 = kotlinx.coroutines.i.g(r4, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r1 = r7
            r10 = r8
            r0 = r9
        L68:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L74
            java.lang.Object r11 = r10.f93280b
            if (r11 != 0) goto L74
            r10 = 0
            return r10
        L74:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y
            java.lang.Object r10 = r10.f93280b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r1.f93280b
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r0, r10, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.t(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.v
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$v r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.v) r0
            int r1 = r0.f58593u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58593u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$v r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$v
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58592t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58593u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f58591s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f58590r
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.d.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$u r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$u
            r5.<init>(r6, r3, r7, r2)
            r0.f58590r = r7
            r0.f58591s = r2
            r0.f58593u = r4
            java.lang.Object r6 = kotlinx.coroutines.i.g(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            java.lang.Object r6 = r6.f93280b
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0
            java.lang.Object r0 = r0.f93280b
            java.lang.String r0 = (java.lang.String) r0
            r7.<init>(r0, r6)
            return r7
        L6b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.u(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t u0(XmlPullParser xmlPullParser) {
        String strG = G(xmlPullParser, com.taurusx.tax.f.s.f66023p);
        if (strG != null) {
            return b0(strG);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object v(org.xmlpull.v1.XmlPullParser r14, kotlin.coroutines.Continuation r15) {
        /*
            boolean r1 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.z
            if (r1 == 0) goto L13
            r1 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$z r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.z) r1
            int r2 = r1.f58644y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.f58644y = r2
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$z r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$z
            r1.<init>(r15)
        L18:
            java.lang.Object r0 = r1.f58643x
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.f58644y
            r4 = 1
            if (r3 == 0) goto L4d
            if (r3 != r4) goto L45
            java.lang.Object r2 = r1.f58642w
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.f58641v
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.f58640u
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r1.f58639t
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r6 = r1.f58638s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r1 = r1.f58637r
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.d.b(r0)
            r8 = r2
            r7 = r3
            r0 = r6
            r6 = r4
            goto L90
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4d:
            kotlin.d.b(r0)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$y r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w$y
            r7 = 0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f58637r = r9
            r1.f58638s = r8
            r1.f58639t = r10
            r1.f58640u = r11
            r1.f58641v = r12
            r1.f58642w = r13
            r1.f58644y = r4
            java.lang.Object r0 = kotlinx.coroutines.i.g(r5, r1)
            if (r0 != r2) goto L8a
            return r2
        L8a:
            r0 = r8
            r1 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
        L90:
            java.lang.Object r1 = r1.f93280b
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b
            java.lang.Object r0 = r0.f93280b
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r0 = r5.f93280b
            r5 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f) r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        La7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.v(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u w() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u();
    }
}
