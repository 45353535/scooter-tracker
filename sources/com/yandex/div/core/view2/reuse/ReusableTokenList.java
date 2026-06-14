package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0003R<\u0010\u001c\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u0019j\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "", "<init>", "()V", "", "isEmpty", "()Z", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "token", "", "add", "(Lcom/yandex/div/core/view2/reuse/ExistingToken;)V", "", "hash", "pop", "(I)Lcom/yandex/div/core/view2/reuse/ExistingToken;", "Lk8/y0;", "div", "(Lk8/y0;)Lcom/yandex/div/core/view2/reuse/ExistingToken;", "Landroid/view/View;", "getUniqueViewForDiv", "(Lk8/y0;)Landroid/view/View;", "remove", "(Lcom/yandex/div/core/view2/reuse/ExistingToken;)Z", "clear", "Ljava/util/HashMap;", "Ljava/util/LinkedList;", "Lkotlin/collections/HashMap;", "reusable", "Ljava/util/HashMap;", "", "viewIndexShift", "Ljava/util/Map;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReusableTokenList {

    @NotNull
    private final HashMap<Integer, LinkedList<ExistingToken>> reusable = new HashMap<>();

    @NotNull
    private final Map<Integer, Integer> viewIndexShift = new LinkedHashMap();

    public final void add(@NotNull ExistingToken token) {
        int divHash = token.getDivHash();
        HashMap<Integer, LinkedList<ExistingToken>> map = this.reusable;
        Integer numValueOf = Integer.valueOf(divHash);
        LinkedList<ExistingToken> linkedList = map.get(numValueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            map.put(numValueOf, linkedList);
        }
        linkedList.add(token);
    }

    public final void clear() {
        this.reusable.clear();
        this.viewIndexShift.clear();
    }

    @Nullable
    public final View getUniqueViewForDiv(@NotNull y0 div) {
        ExistingToken existingToken;
        int iB = div.b();
        Map<Integer, Integer> map = this.viewIndexShift;
        Integer numValueOf = Integer.valueOf(iB);
        Integer num = map.get(numValueOf);
        if (num == null) {
            num = 0;
            map.put(numValueOf, num);
        }
        int iIntValue = num.intValue();
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(iB));
        if (linkedList == null || (existingToken = (ExistingToken) CollectionsKt.getOrNull(linkedList, iIntValue)) == null) {
            return null;
        }
        this.viewIndexShift.put(Integer.valueOf(iB), Integer.valueOf(iIntValue + 1));
        ViewParent parent = existingToken.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(existingToken.getView());
        }
        return existingToken.getView();
    }

    public final boolean isEmpty() {
        return this.reusable.isEmpty();
    }

    @Nullable
    public final ExistingToken pop(int hash) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(hash));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        ExistingToken existingTokenPop = linkedList.pop();
        LinkedList<ExistingToken> linkedList2 = this.reusable.get(Integer.valueOf(hash));
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            return existingTokenPop;
        }
        this.reusable.remove(Integer.valueOf(hash));
        return existingTokenPop;
    }

    public final boolean remove(@NotNull ExistingToken token) {
        Object next;
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(token.getDivHash()));
        if (linkedList == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ExistingToken) next).getView(), token.getView())) {
                break;
            }
        }
        return b1.a(linkedList).remove(next);
    }

    @Nullable
    public final ExistingToken pop(@NotNull y0 div) {
        return pop(div.b());
    }
}
