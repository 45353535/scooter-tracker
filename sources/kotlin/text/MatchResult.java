package kotlin.text;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/text/MatchResult;", "", "next", "()Lkotlin/text/MatchResult;", "Lkotlin/ranges/IntRange;", "d", "()Lkotlin/ranges/IntRange;", SessionDescription.ATTR_RANGE, "", "getValue", "()Ljava/lang/String;", "value", "Lkotlin/text/g;", "b", "()Lkotlin/text/g;", "groups", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$b;", "a", "()Lkotlin/text/MatchResult$b;", "destructured", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MatchResult {

    public static final class a {
        public static b a(MatchResult matchResult) {
            return new b(matchResult);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MatchResult f93474a;

        public b(MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.f93474a = match;
        }

        public final MatchResult a() {
            return this.f93474a;
        }
    }

    b a();

    g b();

    List c();

    IntRange d();

    String getValue();

    MatchResult next();
}
