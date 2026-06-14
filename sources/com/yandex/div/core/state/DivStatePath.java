package com.yandex.div.core.state;

import androidx.annotation.VisibleForTesting;
import androidx.collection.b;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.state.DivStatePath;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k8.ea;
import k8.f7;
import k8.lq;
import k8.y0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<BG\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001fR\u001b\u00102\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0011R\u001b\u00105\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u0010\u0011R\u0013\u00107\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b6\u0010\u0011R\u0013\u00109\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b8\u0010\u0011R\u0014\u0010;\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0011¨\u0006="}, d2 = {"Lcom/yandex/div/core/state/DivStatePath;", "", "", "topLevelStateId", "", "Lkotlin/Pair;", "", "states", "path", "", "containsOnlyStates", "<init>", "(JLjava/util/List;Ljava/util/List;Z)V", "divId", "createFullPath", "(Ljava/lang/String;)Ljava/util/List;", "toString", "()Ljava/lang/String;", "Lk8/lq$c;", "state", "stateIdFallback", "append$div_release", "(Ljava/lang/String;Lk8/lq$c;Ljava/lang/String;)Lcom/yandex/div/core/state/DivStatePath;", "append", "appendDiv", "(Ljava/lang/String;)Lcom/yandex/div/core/state/DivStatePath;", "getStates", "()Ljava/util/List;", "parentState", "()Lcom/yandex/div/core/state/DivStatePath;", "isRootPath", "()Z", "other", "isAncestorOf", "(Lcom/yandex/div/core/state/DivStatePath;)Z", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "getTopLevelStateId", "()J", "Ljava/util/List;", "getPath$div_release", "Z", "getContainsOnlyStates$div_release", "fullPath$delegate", "Lkotlin/Lazy;", "getFullPath$div_release", "fullPath", "statesString$delegate", "getStatesString$div_release", "statesString", "getLastStateId", "lastStateId", "getPathToLastState", "pathToLastState", "getLastDivId$div_release", "lastDivId", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DivStatePath {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean containsOnlyStates;

    /* JADX INFO: renamed from: fullPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fullPath;

    @NotNull
    private final List<String> path;

    @NotNull
    private final List<Pair<String, String>> states;

    /* JADX INFO: renamed from: statesString$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy statesString;
    private final long topLevelStateId;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0007*\b\u0012\u0004\u0012\u00020\t0\u00072\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00040(j\b\u0012\u0004\u0012\u00020\u0004`)H\u0000¢\u0006\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/yandex/div/core/state/DivStatePath$Companion;", "", "<init>", "()V", "Lcom/yandex/div/core/state/DivStatePath;", "somePath", "otherPath", "", "Lkotlin/Pair;", "", "findSharedPairs", "(Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/state/DivStatePath;)Ljava/util/List;", "states", "", "addChild", "extractStates", "(Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;", "state", "", "start", "findState", "(Ljava/util/List;Lkotlin/Pair;I)I", "path", "parse", "(Ljava/lang/String;)Lcom/yandex/div/core/state/DivStatePath;", "", "stateId", "fromState", "(J)Lcom/yandex/div/core/state/DivStatePath;", "Lk8/ea$c;", "fromState$div_release", "(Lk8/ea$c;)Lcom/yandex/div/core/state/DivStatePath;", "Lk8/y0;", "div", "fromRootDiv$div_release", "(JLk8/y0;)Lcom/yandex/div/core/state/DivStatePath;", "fromRootDiv", "lowestCommonAncestor$div_release", "(Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/state/DivStatePath;", "lowestCommonAncestor", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "alphabeticalComparator$div_release", "()Ljava/util/Comparator;", "alphabeticalComparator", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int alphabeticalComparator$lambda$2(DivStatePath divStatePath, DivStatePath divStatePath2) {
            if (divStatePath.getTopLevelStateId() != divStatePath2.getTopLevelStateId()) {
                return (int) (divStatePath.getTopLevelStateId() - divStatePath2.getTopLevelStateId());
            }
            int iMin = Math.min(divStatePath.states.size(), divStatePath2.states.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                Pair pair = (Pair) divStatePath.states.get(i10);
                Pair pair2 = (Pair) divStatePath2.states.get(i10);
                int iCompareTo = DivStatePathKt.getDivId(pair).compareTo(DivStatePathKt.getDivId(pair2));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = DivStatePathKt.getStateId(pair).compareTo(DivStatePathKt.getStateId(pair2));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            return divStatePath.states.size() - divStatePath2.states.size();
        }

        private final List<String> extractStates(List<String> list, List<Pair<String, String>> list2, boolean z10) {
            Iterator<T> it = list2.iterator();
            int iFindState = 0;
            while (it.hasNext()) {
                iFindState = DivStatePath.INSTANCE.findState(list, (Pair) it.next(), iFindState);
            }
            if (z10) {
                iFindState++;
            }
            return list.subList(0, iFindState);
        }

        private final List<Pair<String, String>> findSharedPairs(DivStatePath somePath, DivStatePath otherPath) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Object obj : somePath.states) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) CollectionsKt.getOrNull(otherPath.states, i10);
                if (pair2 == null || !Intrinsics.areEqual(pair, pair2)) {
                    break;
                }
                arrayList.add(pair);
                i10 = i11;
            }
            return arrayList;
        }

        private final int findState(List<String> list, Pair<String, String> pair, int i10) {
            int size = list.size() - 1;
            while (i10 < size) {
                if (Intrinsics.areEqual(list.get(i10), DivStatePathKt.getDivId(pair))) {
                    int i11 = i10 + 1;
                    if (Intrinsics.areEqual(list.get(i11), DivStatePathKt.getStateId(pair))) {
                        return i11;
                    }
                }
                i10++;
            }
            return list.size();
        }

        @NotNull
        public final Comparator<DivStatePath> alphabeticalComparator$div_release() {
            return new Comparator() { // from class: i7.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DivStatePath.Companion.alphabeticalComparator$lambda$2((DivStatePath) obj, (DivStatePath) obj2);
                }
            };
        }

        @NotNull
        public final DivStatePath fromRootDiv$div_release(long stateId, @NotNull y0 div) {
            String strValueOf = String.valueOf(stateId);
            String id2 = DivPathUtils.INSTANCE.getId(div);
            if (id2 == null) {
                id2 = ChildPathUnitCache.INSTANCE.getValue$div_release(0);
            }
            return new DivStatePath(stateId, CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new String[]{strValueOf, id2}), false, 8, null);
        }

        @NotNull
        public final DivStatePath fromState(long stateId) {
            return new DivStatePath(stateId, new ArrayList(), null, false, 12, null);
        }

        @NotNull
        public final DivStatePath fromState$div_release(@NotNull ea.c state) {
            return fromRootDiv$div_release(state.f87216b, state.f87215a);
        }

        @Nullable
        public final DivStatePath lowestCommonAncestor$div_release(@NotNull DivStatePath somePath, @NotNull DivStatePath otherPath) {
            if (somePath.getTopLevelStateId() != otherPath.getTopLevelStateId()) {
                return null;
            }
            List<Pair<String, String>> listFindSharedPairs = findSharedPairs(somePath, otherPath);
            long topLevelStateId = somePath.getTopLevelStateId();
            boolean z10 = true;
            List<String> listExtractStates = extractStates(somePath.getPath$div_release(), listFindSharedPairs, true);
            if (!somePath.getContainsOnlyStates() && !otherPath.getContainsOnlyStates()) {
                z10 = false;
            }
            return new DivStatePath(topLevelStateId, listFindSharedPairs, listExtractStates, z10);
        }

        @NotNull
        public final DivStatePath parse(@NotNull String path) throws PathFormatException {
            ArrayList arrayList = new ArrayList();
            List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
            try {
                long j10 = Long.parseLong((String) listSplit$default.get(0));
                int i10 = 2;
                if (listSplit$default.size() % 2 != 1) {
                    throw new PathFormatException("Must be even number of states in path: " + path, null, i10, 0 == true ? 1 : 0);
                }
                d dVarT = g.t(g.v(1, listSplit$default.size()), 2);
                int iE = dVarT.e();
                int iF = dVarT.f();
                int iG = dVarT.g();
                if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                    while (true) {
                        arrayList.add(TuplesKt.to(listSplit$default.get(iE), listSplit$default.get(iE + 1)));
                        if (iE == iF) {
                            break;
                        }
                        iE += iG;
                    }
                }
                return new DivStatePath(j10, arrayList, listSplit$default, true);
            } catch (NumberFormatException e10) {
                throw new PathFormatException("Top level id must be number: " + path, e10);
            }
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public DivStatePath(long j10, @NotNull List<Pair<String, String>> list, @NotNull List<String> list2, boolean z10) {
        this.topLevelStateId = j10;
        this.states = list;
        this.path = list2;
        this.containsOnlyStates = z10;
        this.fullPath = i.a(new Function0<String>() { // from class: com.yandex.div.core.state.DivStatePath$fullPath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return CollectionsKt.joinToString$default(this.this$0.getPath$div_release(), "/", null, null, 0, null, null, 62, null);
            }
        });
        this.statesString = i.a(new Function0<String>() { // from class: com.yandex.div.core.state.DivStatePath$statesString$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                if (this.this$0.states.isEmpty()) {
                    return String.valueOf(this.this$0.getTopLevelStateId());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.this$0.getTopLevelStateId());
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                List<Pair> list3 = this.this$0.states;
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list3) {
                    CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{DivStatePathKt.getDivId(pair), DivStatePathKt.getStateId(pair)}));
                }
                sb2.append(CollectionsKt.joinToString$default(arrayList, "/", null, null, 0, null, null, 62, null));
                return sb2.toString();
            }
        });
    }

    private final List<String> createFullPath(String divId) {
        ArrayList arrayList = new ArrayList(this.path.size() + 1);
        arrayList.addAll(this.path);
        arrayList.add(divId);
        return arrayList;
    }

    @NotNull
    public static final DivStatePath parse(@NotNull String str) throws PathFormatException {
        return INSTANCE.parse(str);
    }

    @NotNull
    public final DivStatePath append$div_release(@NotNull String divId, @Nullable lq.c state, @NotNull String stateIdFallback) {
        String str;
        y0 y0Var;
        f7 f7VarC;
        String id2;
        ArrayList arrayList = new ArrayList(this.states.size() + 1);
        arrayList.addAll(this.states);
        if (state == null || (str = state.f88890d) == null) {
            str = stateIdFallback;
        }
        arrayList.add(TuplesKt.to(divId, str));
        if (state != null && (y0Var = state.f88889c) != null && (f7VarC = y0Var.c()) != null && (id2 = f7VarC.getId()) != null) {
            stateIdFallback = id2;
        } else if (state != null) {
            stateIdFallback = state.f88890d;
        }
        return new DivStatePath(this.topLevelStateId, arrayList, createFullPath(stateIdFallback), false, 8, null);
    }

    @NotNull
    public final DivStatePath appendDiv(@NotNull String divId) {
        return new DivStatePath(this.topLevelStateId, this.states, createFullPath(divId), false, 8, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) other;
        return this.topLevelStateId == divStatePath.topLevelStateId && Intrinsics.areEqual(this.states, divStatePath.states) && Intrinsics.areEqual(this.path, divStatePath.path) && this.containsOnlyStates == divStatePath.containsOnlyStates;
    }

    /* JADX INFO: renamed from: getContainsOnlyStates$div_release, reason: from getter */
    public final boolean getContainsOnlyStates() {
        return this.containsOnlyStates;
    }

    @NotNull
    public final String getFullPath$div_release() {
        return (String) this.fullPath.getValue();
    }

    @NotNull
    public final String getLastDivId$div_release() {
        return (String) CollectionsKt.last((List) this.path);
    }

    @Nullable
    public final String getLastStateId() {
        if (this.states.isEmpty()) {
            return null;
        }
        return DivStatePathKt.getStateId((Pair) CollectionsKt.last((List) this.states));
    }

    @NotNull
    public final List<String> getPath$div_release() {
        return this.path;
    }

    @Nullable
    public final String getPathToLastState() {
        if (this.states.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new DivStatePath(this.topLevelStateId, this.states.subList(0, r4.size() - 1), this.path, false, 8, null).getStatesString$div_release());
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(DivStatePathKt.getDivId((Pair) CollectionsKt.last((List) this.states)));
        return sb2.toString();
    }

    @NotNull
    public final List<Pair<String, String>> getStates() {
        return this.states;
    }

    @NotNull
    public final String getStatesString$div_release() {
        return (String) this.statesString.getValue();
    }

    public final long getTopLevelStateId() {
        return this.topLevelStateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iA = ((((b.a(this.topLevelStateId) * 31) + this.states.hashCode()) * 31) + this.path.hashCode()) * 31;
        boolean z10 = this.containsOnlyStates;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iA + r12;
    }

    public final boolean isAncestorOf(@NotNull DivStatePath other) {
        if (this.topLevelStateId != other.topLevelStateId || this.states.size() >= other.states.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : this.states) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            Pair<String, String> pair2 = other.states.get(i10);
            if (!Intrinsics.areEqual(DivStatePathKt.getDivId(pair), DivStatePathKt.getDivId(pair2)) || !Intrinsics.areEqual(DivStatePathKt.getStateId(pair), DivStatePathKt.getStateId(pair2))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean isRootPath() {
        return this.states.isEmpty();
    }

    @NotNull
    public final DivStatePath parentState() {
        int iNextIndex;
        int iNextIndex2;
        if (isRootPath()) {
            return this;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) this.states);
        Pair pair = (Pair) mutableList.remove(CollectionsKt.getLastIndex(mutableList));
        List<String> list = this.path;
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (true) {
            iNextIndex = -1;
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            if (Intrinsics.areEqual(listIterator.previous(), DivStatePathKt.getDivId(pair))) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(iNextIndex2);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iNextIndex = numValueOf.intValue();
        } else {
            List<String> list2 = this.path;
            ListIterator<String> listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (Intrinsics.areEqual(StringsKt.s1(listIterator2.previous(), '#', null, 2, null), DivStatePathKt.getDivId(pair))) {
                    iNextIndex = listIterator2.nextIndex();
                    break;
                }
            }
        }
        return new DivStatePath(this.topLevelStateId, mutableList, this.path.subList(0, iNextIndex + 1), false, 8, null);
    }

    @NotNull
    public String toString() {
        return getFullPath$div_release();
    }

    public /* synthetic */ DivStatePath(long j10, List list, List list2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? CollectionsKt.listOf(String.valueOf(j10)) : list2, (i10 & 8) != 0 ? false : z10);
    }
}
