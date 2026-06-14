package com.ironsource.mediationsdk.logger;

import com.ironsource.C4315fb;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* JADX INFO: loaded from: classes10.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IronSourceLogger.IronSourceTag f44079a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f44079a = ironSourceTag;
    }

    public void error(String str, Throwable th2) {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb(str, 3), th2);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f44079a, new C4315fb("", 3));
    }
}
