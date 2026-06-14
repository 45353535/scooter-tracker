package io.bidmachine;

import java.util.Calendar;

/* JADX INFO: loaded from: classes12.dex */
class y5 implements zb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb.d f82026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TargetingParams f82027b;

    y5(zb.d dVar, TargetingParams targetingParams) {
        this.f82026a = dVar;
        this.f82027b = targetingParams;
    }

    @Override // zb.h
    public Integer a() {
        Integer numB = b();
        if (numB != null) {
            return Integer.valueOf(Calendar.getInstance().get(1) - numB.intValue());
        }
        return null;
    }

    public Integer b() {
        if (this.f82026a.d()) {
            return this.f82027b.getBirthdayYear();
        }
        return null;
    }

    @Override // zb.h
    public ae.d getGender() {
        if (this.f82026a.d()) {
            return this.f82027b.getGender();
        }
        return null;
    }
}
