package com.nttdata.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003Jc\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001a\u00a8\u00063"}, d2 = {"Lcom/nttdata/domain/model/ArchiveBusiness;", "", "lead_paragraph", "", "multimedia", "", "Lcom/nttdata/domain/model/ArchiveMultimediaBusiness;", "headline", "Lcom/nttdata/domain/model/ArchiveHeadlineBusiness;", "pub_date", "section_name", "subsection_name", "byline", "Lcom/nttdata/domain/model/ArchiveBylineBusiness;", "(Ljava/lang/String;Ljava/util/List;Lcom/nttdata/domain/model/ArchiveHeadlineBusiness;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nttdata/domain/model/ArchiveBylineBusiness;)V", "getByline", "()Lcom/nttdata/domain/model/ArchiveBylineBusiness;", "setByline", "(Lcom/nttdata/domain/model/ArchiveBylineBusiness;)V", "getHeadline", "()Lcom/nttdata/domain/model/ArchiveHeadlineBusiness;", "setHeadline", "(Lcom/nttdata/domain/model/ArchiveHeadlineBusiness;)V", "getLead_paragraph", "()Ljava/lang/String;", "setLead_paragraph", "(Ljava/lang/String;)V", "getMultimedia", "()Ljava/util/List;", "setMultimedia", "(Ljava/util/List;)V", "getPub_date", "setPub_date", "getSection_name", "setSection_name", "getSubsection_name", "setSubsection_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_debug"})
public final class ArchiveBusiness {
    @org.jetbrains.annotations.Nullable
    private java.lang.String lead_paragraph;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.nttdata.domain.model.ArchiveMultimediaBusiness> multimedia;
    @org.jetbrains.annotations.Nullable
    private com.nttdata.domain.model.ArchiveHeadlineBusiness headline;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pub_date;
    @org.jetbrains.annotations.Nullable
    private java.lang.String section_name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String subsection_name;
    @org.jetbrains.annotations.Nullable
    private com.nttdata.domain.model.ArchiveBylineBusiness byline;
    
    @org.jetbrains.annotations.NotNull
    public final com.nttdata.domain.model.ArchiveBusiness copy(@org.jetbrains.annotations.Nullable
    java.lang.String lead_paragraph, @org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.domain.model.ArchiveMultimediaBusiness> multimedia, @org.jetbrains.annotations.Nullable
    com.nttdata.domain.model.ArchiveHeadlineBusiness headline, @org.jetbrains.annotations.Nullable
    java.lang.String pub_date, @org.jetbrains.annotations.Nullable
    java.lang.String section_name, @org.jetbrains.annotations.Nullable
    java.lang.String subsection_name, @org.jetbrains.annotations.Nullable
    com.nttdata.domain.model.ArchiveBylineBusiness byline) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ArchiveBusiness(@org.jetbrains.annotations.Nullable
    java.lang.String lead_paragraph, @org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.domain.model.ArchiveMultimediaBusiness> multimedia, @org.jetbrains.annotations.Nullable
    com.nttdata.domain.model.ArchiveHeadlineBusiness headline, @org.jetbrains.annotations.Nullable
    java.lang.String pub_date, @org.jetbrains.annotations.Nullable
    java.lang.String section_name, @org.jetbrains.annotations.Nullable
    java.lang.String subsection_name, @org.jetbrains.annotations.Nullable
    com.nttdata.domain.model.ArchiveBylineBusiness byline) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLead_paragraph() {
        return null;
    }
    
    public final void setLead_paragraph(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nttdata.domain.model.ArchiveMultimediaBusiness> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nttdata.domain.model.ArchiveMultimediaBusiness> getMultimedia() {
        return null;
    }
    
    public final void setMultimedia(@org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.domain.model.ArchiveMultimediaBusiness> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.domain.model.ArchiveHeadlineBusiness component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.domain.model.ArchiveHeadlineBusiness getHeadline() {
        return null;
    }
    
    public final void setHeadline(@org.jetbrains.annotations.Nullable
    com.nttdata.domain.model.ArchiveHeadlineBusiness p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPub_date() {
        return null;
    }
    
    public final void setPub_date(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSection_name() {
        return null;
    }
    
    public final void setSection_name(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubsection_name() {
        return null;
    }
    
    public final void setSubsection_name(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.domain.model.ArchiveBylineBusiness component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.domain.model.ArchiveBylineBusiness getByline() {
        return null;
    }
    
    public final void setByline(@org.jetbrains.annotations.Nullable
    com.nttdata.domain.model.ArchiveBylineBusiness p0) {
    }
}