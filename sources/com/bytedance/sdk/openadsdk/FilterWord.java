package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FilterWord {
    private boolean lnr;
    private List<FilterWord> mml;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16754ud;

    public FilterWord(String str, String str2) {
        this.qdl = str;
        this.f16754ud = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.mml == null) {
            this.mml = new ArrayList();
        }
        this.mml.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.qdl;
    }

    public boolean getIsSelected() {
        return this.lnr;
    }

    public String getName() {
        return this.f16754ud;
    }

    public List<FilterWord> getOptions() {
        return this.mml;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.mml;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.qdl) || TextUtils.isEmpty(this.f16754ud)) ? false : true;
    }

    public void setId(String str) {
        this.qdl = str;
    }

    public void setIsSelected(boolean z10) {
        this.lnr = z10;
    }

    public void setName(String str) {
        this.f16754ud = str;
    }

    public FilterWord() {
    }
}
