package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.util.concurrent.Service;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
interface ServiceManagerBridge {
    ImmutableMultimap<Service.State, Service> servicesByState();
}
