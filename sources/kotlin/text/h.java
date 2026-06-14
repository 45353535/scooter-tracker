package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.h;

/* JADX INFO: loaded from: classes3.dex */
final class h implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f93527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f93528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f93529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f93530d;

    public static final class a extends AbstractList {
        a() {
        }

        public /* bridge */ boolean b(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = h.this.f().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return h.this.f().groupCount() + 1;
        }

        public /* bridge */ int i(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return j((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends AbstractCollection implements g {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchGroup i(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return g((MatchGroup) obj);
            }
            return false;
        }

        public /* bridge */ boolean g(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.text.g
        public MatchGroup get(int i10) {
            IntRange intRangeH = j.h(h.this.f(), i10);
            if (intRangeH.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = h.this.f().group(i10);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRangeH);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return h.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return kotlin.sequences.k.Q(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new Function1() { // from class: kotlin.text.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.b.i(this.f93533b, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public h(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f93527a = matcher;
        this.f93528b = input;
        this.f93529c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult f() {
        return this.f93527a;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.b a() {
        return MatchResult.a.a(this);
    }

    @Override // kotlin.text.MatchResult
    public g b() {
        return this.f93529c;
    }

    @Override // kotlin.text.MatchResult
    public List c() {
        if (this.f93530d == null) {
            this.f93530d = new a();
        }
        List list = this.f93530d;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public IntRange d() {
        return j.g(f());
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String strGroup = f().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.f93528b.length()) {
            return null;
        }
        Matcher matcher = this.f93527a.pattern().matcher(this.f93528b);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return j.e(matcher, iEnd, this.f93528b);
    }
}
