package com.amazon.device.ads;

/* JADX INFO: loaded from: classes5.dex */
class StateProperty extends MraidStringProperty {
    MraidStateType stateType;

    StateProperty(MraidStateType mraidStateType) {
        super("state");
        this.stateType = mraidStateType;
    }

    @Override // com.amazon.device.ads.MraidStringProperty
    String getValue() {
        return this.stateType.toString();
    }
}
