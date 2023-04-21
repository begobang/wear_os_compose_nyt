package com.nttdata.presentation.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u00102\u001a\u00020\u000fH\u00c6\u0003Jm\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u000207H\u00d6\u0001J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 \u00a8\u00069"}, d2 = {"Lcom/nttdata/presentation/entities/ArchiveViewEntity;", "", "lead_paragraph", "", "multimedia", "", "Lcom/nttdata/presentation/entities/ArchiveMultimediaViewEntity;", "headline", "Lcom/nttdata/presentation/entities/ArchiveHeadlineViewEntity;", "pub_date", "section_name", "subsection_name", "byline", "Lcom/nttdata/presentation/entities/ArchiveBylineViewEntity;", "added", "", "(Ljava/lang/String;Ljava/util/List;Lcom/nttdata/presentation/entities/ArchiveHeadlineViewEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nttdata/presentation/entities/ArchiveBylineViewEntity;Z)V", "getAdded", "()Z", "setAdded", "(Z)V", "getByline", "()Lcom/nttdata/presentation/entities/ArchiveBylineViewEntity;", "setByline", "(Lcom/nttdata/presentation/entities/ArchiveBylineViewEntity;)V", "getHeadline", "()Lcom/nttdata/presentation/entities/ArchiveHeadlineViewEntity;", "setHeadline", "(Lcom/nttdata/presentation/entities/ArchiveHeadlineViewEntity;)V", "getLead_paragraph", "()Ljava/lang/String;", "setLead_paragraph", "(Ljava/lang/String;)V", "getMultimedia", "()Ljava/util/List;", "setMultimedia", "(Ljava/util/List;)V", "getPub_date", "setPub_date", "getSection_name", "setSection_name", "getSubsection_name", "setSubsection_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "presentation_debug"})
public final class ArchiveViewEntity {
    @org.jetbrains.annotations.Nullable
    private java.lang.String lead_paragraph;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.nttdata.presentation.entities.ArchiveMultimediaViewEntity> multimedia;
    @org.jetbrains.annotations.Nullable
    private com.nttdata.presentation.entities.ArchiveHeadlineViewEntity headline;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pub_date;
    @org.jetbrains.annotations.Nullable
    private java.lang.String section_name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String subsection_name;
    @org.jetbrains.annotations.Nullable
    private com.nttdata.presentation.entities.ArchiveBylineViewEntity byline;
    private boolean added;
    
    @org.jetbrains.annotations.NotNull
    public final com.nttdata.presentation.entities.ArchiveViewEntity copy(@org.jetbrains.annotations.Nullable
    java.lang.String lead_paragraph, @org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.presentation.entities.ArchiveMultimediaViewEntity> multimedia, @org.jetbrains.annotations.Nullable
    com.nttdata.presentation.entities.ArchiveHeadlineViewEntity headline, @org.jetbrains.annotations.Nullable
    java.lang.String pub_date, @org.jetbrains.annotations.Nullable
    java.lang.String section_name, @org.jetbrains.annotations.Nullable
    java.lang.String subsection_name, @org.jetbrains.annotations.Nullable
    com.nttdata.presentation.entities.ArchiveBylineViewEntity byline, boolean added) {
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
    
    public ArchiveViewEntity(@org.jetbrains.annotations.Nullable
    java.lang.String lead_paragraph, @org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.presentation.entities.ArchiveMultimediaViewEntity> multimedia, @org.jetbrains.annotations.Nullable
    com.nttdata.presentation.entities.ArchiveHeadlineViewEntity headline, @org.jetbrains.annotations.Nullable
    java.lang.String pub_date, @org.jetbrains.annotations.Nullable
    java.lang.String section_name, @org.jetbrains.annotations.Nullable
    java.lang.String subsection_name, @org.jetbrains.annotations.Nullable
    com.nttdata.presentation.entities.ArchiveBylineViewEntity byline, boolean added) {
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
    public final java.util.List<com.nttdata.presentation.entities.ArchiveMultimediaViewEntity> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nttdata.presentation.entities.ArchiveMultimediaViewEntity> getMultimedia() {
        return null;
    }
    
    public final void setMultimedia(@org.jetbrains.annotations.Nullable
    java.util.List<com.nttdata.presentation.entities.ArchiveMultimediaViewEntity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.presentation.entities.ArchiveHeadlineViewEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.presentation.entities.ArchiveHeadlineViewEntity getHeadline() {
        return null;
    }
    
    public final void setHeadline(@org.jetbrains.annotations.Nullable
    com.nttdata.presentation.entities.ArchiveHeadlineViewEntity p0) {
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
    public final com.nttdata.presentation.entities.ArchiveBylineViewEntity component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nttdata.presentation.entities.ArchiveBylineViewEntity getByline() {
        return null;
    }
    
    public final void setByline(@org.jetbrains.annotations.Nullable
    com.nttdata.presentation.entities.ArchiveBylineViewEntity p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getAdded() {
        return false;
    }
    
    public final void setAdded(boolean p0) {
    }
}