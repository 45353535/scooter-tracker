package kotlin.ranges;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/d;", "Lbg/c;", "", "", "start", "endInclusive", "<init>", "(II)V", "value", "", CampaignEx.JSON_KEY_AD_K, "(I)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "m", "()Ljava/lang/Integer;", CmcdData.Factory.STREAM_TYPE_LIVE, InneractiveMediationDefs.GENDER_FEMALE, "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntRange extends d implements bg.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final IntRange f93352g = new IntRange(1, 0);

    /* JADX INFO: renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange a() {
            return IntRange.f93352g;
        }

        private Companion() {
        }
    }

    public IntRange(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // kotlin.ranges.d
    public boolean equals(Object other) {
        if (!(other instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) other).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) other;
        return e() == intRange.e() && f() == intRange.f();
    }

    @Override // kotlin.ranges.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    @Override // kotlin.ranges.d, bg.c
    public boolean isEmpty() {
        return e() > f();
    }

    public boolean k(int value) {
        return e() <= value && value <= f();
    }

    @Override // bg.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(f());
    }

    @Override // bg.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(e());
    }

    @Override // kotlin.ranges.d
    public String toString() {
        return e() + ".." + f();
    }
}
