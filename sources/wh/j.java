package wh;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u0;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import vh.c0;
import vh.k;
import vh.l;
import vh.o0;
import vh.x;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(((i) obj).a(), ((i) obj2).a());
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref$BooleanRef f108042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f108043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u0 f108044h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ vh.g f108045i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ u0 f108046j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u0 f108047k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref$BooleanRef ref$BooleanRef, long j10, u0 u0Var, vh.g gVar, u0 u0Var2, u0 u0Var3) {
            super(2);
            this.f108042f = ref$BooleanRef;
            this.f108043g = j10;
            this.f108044h = u0Var;
            this.f108045i = gVar;
            this.f108046j = u0Var2;
            this.f108047k = u0Var3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f93236a;
        }

        public final void invoke(int i10, long j10) throws IOException {
            if (i10 == 1) {
                Ref$BooleanRef ref$BooleanRef = this.f108042f;
                if (ref$BooleanRef.f93279b) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                ref$BooleanRef.f93279b = true;
                if (j10 < this.f108043g) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                u0 u0Var = this.f108044h;
                long longLe = u0Var.f93333b;
                if (longLe == 4294967295L) {
                    longLe = this.f108045i.readLongLe();
                }
                u0Var.f93333b = longLe;
                u0 u0Var2 = this.f108046j;
                u0Var2.f93333b = u0Var2.f93333b == 4294967295L ? this.f108045i.readLongLe() : 0L;
                u0 u0Var3 = this.f108047k;
                u0Var3.f93333b = u0Var3.f93333b == 4294967295L ? this.f108045i.readLongLe() : 0L;
            }
        }
    }

    static final class c extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ vh.g f108048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f108049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f108050h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f108051i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(vh.g gVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2);
            this.f108048f = gVar;
            this.f108049g = ref$ObjectRef;
            this.f108050h = ref$ObjectRef2;
            this.f108051i = ref$ObjectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f93236a;
        }

        public final void invoke(int i10, long j10) throws IOException {
            if (i10 == 21589) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.f108048f.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                vh.g gVar = this.f108048f;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f108049g.f93280b = Long.valueOf(((long) gVar.readIntLe()) * 1000);
                }
                if (z11) {
                    this.f108050h.f93280b = Long.valueOf(((long) this.f108048f.readIntLe()) * 1000);
                }
                if (z12) {
                    this.f108051i.f93280b = Long.valueOf(((long) this.f108048f.readIntLe()) * 1000);
                }
            }
        }
    }

    private static final Map a(List list) {
        c0 c0VarE = c0.a.e(c0.f106805c, "/", false, 1, null);
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(c0VarE, new i(c0VarE, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (i iVar : CollectionsKt.sortedWith(list, new a())) {
            if (((i) mapMutableMapOf.put(iVar.a(), iVar)) == null) {
                while (true) {
                    c0 c0VarJ = iVar.a().j();
                    if (c0VarJ != null) {
                        i iVar2 = (i) mapMutableMapOf.get(c0VarJ);
                        if (iVar2 != null) {
                            iVar2.b().add(iVar.a());
                            break;
                        }
                        i iVar3 = new i(c0VarJ, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapMutableMapOf.put(c0VarJ, iVar3);
                        iVar3.b().add(iVar.a());
                        iVar = iVar3;
                    }
                }
            }
        }
        return mapMutableMapOf;
    }

    private static final Long b(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final o0 d(c0 zipPath, l fileSystem, Function1 predicate) throws IOException {
        long jM;
        long j10;
        vh.g gVarD;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        vh.j jVarN = fileSystem.n(zipPath);
        try {
            jM = jVarN.M() - ((long) 22);
        } finally {
        }
        if (jM < 0) {
            throw new IOException("not a zip: size=" + jVarN.M());
        }
        long jMax = Math.max(jM - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
        do {
            vh.g gVarD2 = x.d(jVarN.R(jM));
            try {
                if (gVarD2.readIntLe() == 101010256) {
                    f fVarF = f(gVarD2);
                    String utf8 = gVarD2.readUtf8(fVarF.b());
                    gVarD2.close();
                    long j11 = jM - ((long) 20);
                    if (j11 > 0) {
                        gVarD = x.d(jVarN.R(j11));
                        try {
                            if (gVarD.readIntLe() == 117853008) {
                                int intLe = gVarD.readIntLe();
                                long longLe = gVarD.readLongLe();
                                if (gVarD.readIntLe() != 1 || intLe != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                gVarD = x.d(jVarN.R(longLe));
                                try {
                                    int intLe2 = gVarD.readIntLe();
                                    if (intLe2 != 101075792) {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(intLe2));
                                    }
                                    fVarF = j(gVarD, fVarF);
                                    Unit unit = Unit.f93236a;
                                    uf.c.a(gVarD, null);
                                } finally {
                                }
                            }
                            Unit unit2 = Unit.f93236a;
                            uf.c.a(gVarD, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    gVarD = x.d(jVarN.R(fVarF.a()));
                    try {
                        long jC = fVarF.c();
                        for (j10 = 0; j10 < jC; j10++) {
                            i iVarE = e(gVarD);
                            if (iVarE.f() >= fVarF.a()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (((Boolean) predicate.invoke(iVarE)).booleanValue()) {
                                arrayList.add(iVarE);
                            }
                        }
                        Unit unit3 = Unit.f93236a;
                        uf.c.a(gVarD, null);
                        o0 o0Var = new o0(zipPath, fileSystem, a(arrayList), utf8);
                        uf.c.a(jVarN, null);
                        return o0Var;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                gVarD2.close();
                jM--;
            } finally {
                gVarD2.close();
            }
        } while (jM >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    public static final i e(vh.g gVar) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int intLe = gVar.readIntLe();
        if (intLe != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(intLe));
        }
        gVar.skip(4L);
        short shortLe = gVar.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        int shortLe2 = gVar.readShortLe() & 65535;
        Long lB = b(gVar.readShortLe() & 65535, gVar.readShortLe() & 65535);
        long intLe2 = ((long) gVar.readIntLe()) & 4294967295L;
        u0 u0Var = new u0();
        u0Var.f93333b = ((long) gVar.readIntLe()) & 4294967295L;
        u0 u0Var2 = new u0();
        u0Var2.f93333b = ((long) gVar.readIntLe()) & 4294967295L;
        int shortLe3 = gVar.readShortLe() & 65535;
        int shortLe4 = gVar.readShortLe() & 65535;
        int shortLe5 = gVar.readShortLe() & 65535;
        gVar.skip(8L);
        u0 u0Var3 = new u0();
        u0Var3.f93333b = ((long) gVar.readIntLe()) & 4294967295L;
        String utf8 = gVar.readUtf8(shortLe3);
        if (StringsKt.f0(utf8, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = u0Var2.f93333b == 4294967295L ? 8 : 0L;
        if (u0Var.f93333b == 4294967295L) {
            j10 += (long) 8;
        }
        if (u0Var3.f93333b == 4294967295L) {
            j10 += (long) 8;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        g(gVar, shortLe4, new b(ref$BooleanRef, j10, u0Var2, gVar, u0Var, u0Var3));
        if (j10 <= 0 || ref$BooleanRef.f93279b) {
            return new i(c0.a.e(c0.f106805c, "/", false, 1, null).l(utf8), StringsKt.M(utf8, "/", false, 2, null), gVar.readUtf8(shortLe5), intLe2, u0Var.f93333b, u0Var2.f93333b, shortLe2, lB, u0Var3.f93333b);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final f f(vh.g gVar) throws IOException {
        int shortLe = gVar.readShortLe() & 65535;
        int shortLe2 = gVar.readShortLe() & 65535;
        long shortLe3 = gVar.readShortLe() & 65535;
        if (shortLe3 != (gVar.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(4L);
        return new f(shortLe3, 4294967295L & ((long) gVar.readIntLe()), gVar.readShortLe() & 65535);
    }

    private static final void g(vh.g gVar, int i10, Function2 function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = gVar.readShortLe() & 65535;
            long shortLe2 = ((long) gVar.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - ((long) 4);
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            gVar.require(shortLe2);
            long jE0 = gVar.getBuffer().e0();
            function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long jE02 = (gVar.getBuffer().e0() + shortLe2) - jE0;
            if (jE02 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + shortLe);
            }
            if (jE02 > 0) {
                gVar.getBuffer().skip(jE02);
            }
            j10 = j11 - shortLe2;
        }
    }

    public static final k h(vh.g gVar, k basicMetadata) throws IOException {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        k kVarI = i(gVar, basicMetadata);
        Intrinsics.checkNotNull(kVarI);
        return kVarI;
    }

    private static final k i(vh.g gVar, k kVar) throws IOException {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = kVar != null ? kVar.c() : null;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int intLe = gVar.readIntLe();
        if (intLe != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(intLe));
        }
        gVar.skip(2L);
        short shortLe = gVar.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        gVar.skip(18L);
        long shortLe2 = ((long) gVar.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = gVar.readShortLe() & 65535;
        gVar.skip(shortLe2);
        if (kVar == null) {
            gVar.skip(shortLe3);
            return null;
        }
        g(gVar, shortLe3, new c(gVar, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return new k(kVar.g(), kVar.f(), null, kVar.d(), (Long) ref$ObjectRef3.f93280b, (Long) ref$ObjectRef.f93280b, (Long) ref$ObjectRef2.f93280b, null, 128, null);
    }

    private static final f j(vh.g gVar, f fVar) throws IOException {
        gVar.skip(12L);
        int intLe = gVar.readIntLe();
        int intLe2 = gVar.readIntLe();
        long longLe = gVar.readLongLe();
        if (longLe != gVar.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        gVar.skip(8L);
        return new f(longLe, gVar.readLongLe(), fVar.b());
    }

    public static final void k(vh.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        i(gVar, null);
    }
}
