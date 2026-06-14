package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Splitter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharMatcher f28934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Strategy f28936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28937d;

    public static final class MapSplitter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Splitter f28949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Splitter f28950b;

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f28949a.split(charSequence)) {
                Iterator itF = this.f28950b.f(str);
                Preconditions.checkArgument(itF.hasNext(), "Chunk [%s] is not a valid entry", str);
                String str2 = (String) itF.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itF.hasNext(), "Chunk [%s] is not a valid entry", str);
                linkedHashMap.put(str2, (String) itF.next());
                Preconditions.checkArgument(!itF.hasNext(), "Chunk [%s] is not a valid entry", str);
            }
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
            this.f28949a = splitter;
            this.f28950b = (Splitter) Preconditions.checkNotNull(splitter2);
        }
    }

    private static abstract class SplittingIterator extends AbstractIterator<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final CharSequence f28951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final CharMatcher f28952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f28953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f28954g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28955h;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.f28952e = splitter.f28934a;
            this.f28953f = splitter.f28935b;
            this.f28955h = splitter.f28937d;
            this.f28951d = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iSeparatorStart;
            int i10 = this.f28954g;
            while (true) {
                int i11 = this.f28954g;
                if (i11 == -1) {
                    return (String) b();
                }
                iSeparatorStart = separatorStart(i11);
                if (iSeparatorStart == -1) {
                    iSeparatorStart = this.f28951d.length();
                    this.f28954g = -1;
                } else {
                    this.f28954g = separatorEnd(iSeparatorStart);
                }
                int i12 = this.f28954g;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f28954g = i13;
                    if (i13 > this.f28951d.length()) {
                        this.f28954g = -1;
                    }
                } else {
                    while (i10 < iSeparatorStart && this.f28952e.matches(this.f28951d.charAt(i10))) {
                        i10++;
                    }
                    while (iSeparatorStart > i10 && this.f28952e.matches(this.f28951d.charAt(iSeparatorStart - 1))) {
                        iSeparatorStart--;
                    }
                    if (!this.f28953f || i10 != iSeparatorStart) {
                        break;
                    }
                    i10 = this.f28954g;
                }
            }
            int i14 = this.f28955h;
            if (i14 == 1) {
                iSeparatorStart = this.f28951d.length();
                this.f28954g = -1;
                while (iSeparatorStart > i10 && this.f28952e.matches(this.f28951d.charAt(iSeparatorStart - 1))) {
                    iSeparatorStart--;
                }
            } else {
                this.f28955h = i14 - 1;
            }
            return this.f28951d.subSequence(i10, iSeparatorStart).toString();
        }

        abstract int separatorEnd(int i10);

        abstract int separatorStart(int i10);
    }

    private interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    static Splitter e(final CommonPattern commonPattern) {
        Preconditions.checkArgument(!commonPattern.matcher("").matches(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher commonMatcherMatcher = commonPattern.matcher(charSequence);
                return new SplittingIterator(this, splitter, charSequence) { // from class: com.google.common.base.Splitter.3.1

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass3 f28944j;

                    {
                        this.f28944j = this;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i10) {
                        return commonMatcherMatcher.end();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i10) {
                        if (commonMatcherMatcher.find(i10)) {
                            return commonMatcherMatcher.start();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator f(CharSequence charSequence) {
        return this.f28936c.iterator(this, charSequence);
    }

    public static Splitter fixedLength(final int i10) {
        Preconditions.checkArgument(i10 > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.4
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i11) {
                        return i11;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i11) {
                        int i12 = i11 + i10;
                        if (i12 < this.f28951d.length()) {
                            return i12;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public static Splitter on(char c10) {
        return on(CharMatcher.is(c10));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return e(Platform.a(str));
    }

    public Splitter limit(int i10) {
        Preconditions.checkArgument(i10 > 0, "must be greater than zero: %s", i10);
        return new Splitter(this.f28936c, this.f28935b, this.f28934a, i10);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.f28936c, true, this.f28934a, this.f28937d);
    }

    public Iterable<String> split(final CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new Iterable<String>(this) { // from class: com.google.common.base.Splitter.5

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Splitter f28948c;

            {
                this.f28948c = this;
            }

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return this.f28948c.f(charSequence);
            }

            public String toString() {
                Joiner joinerOn = Joiner.on(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                StringBuilder sbAppendTo = joinerOn.appendTo(sb2, (Iterable<? extends Object>) this);
                sbAppendTo.append(']');
                return sbAppendTo.toString();
            }
        };
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(on(str));
    }

    private Splitter(Strategy strategy, boolean z10, CharMatcher charMatcher, int i10) {
        this.f28936c = strategy;
        this.f28935b = z10;
        this.f28934a = charMatcher;
        this.f28937d = i10;
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorEnd(int i10) {
                        return i10 + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorStart(int i10) {
                        return charMatcher.indexIn(this.f28951d, i10);
                    }
                };
            }
        });
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.f28936c, this.f28935b, charMatcher, this.f28937d);
    }

    public MapSplitter withKeyValueSeparator(char c10) {
        return withKeyValueSeparator(on(c10));
    }

    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(splitter);
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i10) {
                        return i10 + str.length();
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                    
                        r6 = r6 + 1;
                     */
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public int separatorStart(int r6) {
                        /*
                            r5 = this;
                            com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r0 = r1
                            int r0 = r0.length()
                            java.lang.CharSequence r1 = r5.f28951d
                            int r1 = r1.length()
                            int r1 = r1 - r0
                        Lf:
                            if (r6 > r1) goto L2d
                            r2 = 0
                        L12:
                            if (r2 >= r0) goto L2c
                            java.lang.CharSequence r3 = r5.f28951d
                            int r4 = r2 + r6
                            char r3 = r3.charAt(r4)
                            com.google.common.base.Splitter$2 r4 = com.google.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r4 = r1
                            char r4 = r4.charAt(r2)
                            if (r3 == r4) goto L29
                            int r6 = r6 + 1
                            goto Lf
                        L29:
                            int r2 = r2 + 1
                            goto L12
                        L2c:
                            return r6
                        L2d:
                            r6 = -1
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.AnonymousClass2.AnonymousClass1.separatorStart(int):int");
                    }
                };
            }
        });
    }

    @GwtIncompatible
    public static Splitter on(Pattern pattern) {
        return e(new JdkPattern(pattern));
    }
}
