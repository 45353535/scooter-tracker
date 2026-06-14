package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32940b;

    AutoValue_LibraryVersion(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f32939a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f32940b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LibraryVersion) {
            LibraryVersion libraryVersion = (LibraryVersion) obj;
            if (this.f32939a.equals(libraryVersion.getLibraryName()) && this.f32940b.equals(libraryVersion.getVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getLibraryName() {
        return this.f32939a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getVersion() {
        return this.f32940b;
    }

    public int hashCode() {
        return ((this.f32939a.hashCode() ^ 1000003) * 1000003) ^ this.f32940b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f32939a + ", version=" + this.f32940b + "}";
    }
}
