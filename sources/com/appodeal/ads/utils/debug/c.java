package com.appodeal.ads.utils.debug;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14986a;

    public c(f fVar) {
        this.f14986a = fVar;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(charSequence)) {
            arrayList.addAll(this.f14986a.f14988b);
        } else {
            for (r rVar : this.f14986a.f14988b) {
                if (rVar.f15009b.toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                    arrayList.add(rVar);
                }
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.count = arrayList.size();
        filterResults.values = arrayList;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f14986a.setNotifyOnChange(false);
        this.f14986a.clear();
        this.f14986a.setNotifyOnChange(true);
        this.f14986a.addAll((List) filterResults.values);
    }
}
