// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/geo_target_constant_service.proto

package com.google.ads.googleads.v1.services;

/**
 * <pre>
 * Response message for [GeoTargetConstantService.SuggestGeoTargetConstants][google.ads.googleads.v1.services.GeoTargetConstantService.SuggestGeoTargetConstants]
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse}
 */
public  final class SuggestGeoTargetConstantsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse)
    SuggestGeoTargetConstantsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestGeoTargetConstantsResponse.newBuilder() to construct.
  private SuggestGeoTargetConstantsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestGeoTargetConstantsResponse() {
    geoTargetConstantSuggestions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SuggestGeoTargetConstantsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              geoTargetConstantSuggestions_ = new java.util.ArrayList<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion>();
              mutable_bitField0_ |= 0x00000001;
            }
            geoTargetConstantSuggestions_.add(
                input.readMessage(com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        geoTargetConstantSuggestions_ = java.util.Collections.unmodifiableList(geoTargetConstantSuggestions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.services.GeoTargetConstantServiceProto.internal_static_google_ads_googleads_v1_services_SuggestGeoTargetConstantsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.services.GeoTargetConstantServiceProto.internal_static_google_ads_googleads_v1_services_SuggestGeoTargetConstantsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.class, com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.Builder.class);
  }

  public static final int GEO_TARGET_CONSTANT_SUGGESTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion> geoTargetConstantSuggestions_;
  /**
   * <pre>
   * Geo target constant suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
   */
  public java.util.List<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion> getGeoTargetConstantSuggestionsList() {
    return geoTargetConstantSuggestions_;
  }
  /**
   * <pre>
   * Geo target constant suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder> 
      getGeoTargetConstantSuggestionsOrBuilderList() {
    return geoTargetConstantSuggestions_;
  }
  /**
   * <pre>
   * Geo target constant suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
   */
  public int getGeoTargetConstantSuggestionsCount() {
    return geoTargetConstantSuggestions_.size();
  }
  /**
   * <pre>
   * Geo target constant suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
   */
  public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion getGeoTargetConstantSuggestions(int index) {
    return geoTargetConstantSuggestions_.get(index);
  }
  /**
   * <pre>
   * Geo target constant suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
   */
  public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder getGeoTargetConstantSuggestionsOrBuilder(
      int index) {
    return geoTargetConstantSuggestions_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < geoTargetConstantSuggestions_.size(); i++) {
      output.writeMessage(1, geoTargetConstantSuggestions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < geoTargetConstantSuggestions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, geoTargetConstantSuggestions_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse other = (com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse) obj;

    boolean result = true;
    result = result && getGeoTargetConstantSuggestionsList()
        .equals(other.getGeoTargetConstantSuggestionsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getGeoTargetConstantSuggestionsCount() > 0) {
      hash = (37 * hash) + GEO_TARGET_CONSTANT_SUGGESTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getGeoTargetConstantSuggestionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for [GeoTargetConstantService.SuggestGeoTargetConstants][google.ads.googleads.v1.services.GeoTargetConstantService.SuggestGeoTargetConstants]
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse)
      com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.services.GeoTargetConstantServiceProto.internal_static_google_ads_googleads_v1_services_SuggestGeoTargetConstantsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.services.GeoTargetConstantServiceProto.internal_static_google_ads_googleads_v1_services_SuggestGeoTargetConstantsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.class, com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getGeoTargetConstantSuggestionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        geoTargetConstantSuggestions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        geoTargetConstantSuggestionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.services.GeoTargetConstantServiceProto.internal_static_google_ads_googleads_v1_services_SuggestGeoTargetConstantsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse build() {
      com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse buildPartial() {
      com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse result = new com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse(this);
      int from_bitField0_ = bitField0_;
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          geoTargetConstantSuggestions_ = java.util.Collections.unmodifiableList(geoTargetConstantSuggestions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.geoTargetConstantSuggestions_ = geoTargetConstantSuggestions_;
      } else {
        result.geoTargetConstantSuggestions_ = geoTargetConstantSuggestionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse) {
        return mergeFrom((com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse other) {
      if (other == com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse.getDefaultInstance()) return this;
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        if (!other.geoTargetConstantSuggestions_.isEmpty()) {
          if (geoTargetConstantSuggestions_.isEmpty()) {
            geoTargetConstantSuggestions_ = other.geoTargetConstantSuggestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGeoTargetConstantSuggestionsIsMutable();
            geoTargetConstantSuggestions_.addAll(other.geoTargetConstantSuggestions_);
          }
          onChanged();
        }
      } else {
        if (!other.geoTargetConstantSuggestions_.isEmpty()) {
          if (geoTargetConstantSuggestionsBuilder_.isEmpty()) {
            geoTargetConstantSuggestionsBuilder_.dispose();
            geoTargetConstantSuggestionsBuilder_ = null;
            geoTargetConstantSuggestions_ = other.geoTargetConstantSuggestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            geoTargetConstantSuggestionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGeoTargetConstantSuggestionsFieldBuilder() : null;
          } else {
            geoTargetConstantSuggestionsBuilder_.addAllMessages(other.geoTargetConstantSuggestions_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion> geoTargetConstantSuggestions_ =
      java.util.Collections.emptyList();
    private void ensureGeoTargetConstantSuggestionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        geoTargetConstantSuggestions_ = new java.util.ArrayList<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion>(geoTargetConstantSuggestions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder> geoTargetConstantSuggestionsBuilder_;

    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion> getGeoTargetConstantSuggestionsList() {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(geoTargetConstantSuggestions_);
      } else {
        return geoTargetConstantSuggestionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public int getGeoTargetConstantSuggestionsCount() {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        return geoTargetConstantSuggestions_.size();
      } else {
        return geoTargetConstantSuggestionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion getGeoTargetConstantSuggestions(int index) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        return geoTargetConstantSuggestions_.get(index);
      } else {
        return geoTargetConstantSuggestionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder setGeoTargetConstantSuggestions(
        int index, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion value) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.set(index, value);
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder setGeoTargetConstantSuggestions(
        int index, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder builderForValue) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.set(index, builderForValue.build());
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder addGeoTargetConstantSuggestions(com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion value) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.add(value);
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder addGeoTargetConstantSuggestions(
        int index, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion value) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.add(index, value);
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder addGeoTargetConstantSuggestions(
        com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder builderForValue) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.add(builderForValue.build());
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder addGeoTargetConstantSuggestions(
        int index, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder builderForValue) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.add(index, builderForValue.build());
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder addAllGeoTargetConstantSuggestions(
        java.lang.Iterable<? extends com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion> values) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        ensureGeoTargetConstantSuggestionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, geoTargetConstantSuggestions_);
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder clearGeoTargetConstantSuggestions() {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        geoTargetConstantSuggestions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public Builder removeGeoTargetConstantSuggestions(int index) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        ensureGeoTargetConstantSuggestionsIsMutable();
        geoTargetConstantSuggestions_.remove(index);
        onChanged();
      } else {
        geoTargetConstantSuggestionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder getGeoTargetConstantSuggestionsBuilder(
        int index) {
      return getGeoTargetConstantSuggestionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder getGeoTargetConstantSuggestionsOrBuilder(
        int index) {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        return geoTargetConstantSuggestions_.get(index);  } else {
        return geoTargetConstantSuggestionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder> 
         getGeoTargetConstantSuggestionsOrBuilderList() {
      if (geoTargetConstantSuggestionsBuilder_ != null) {
        return geoTargetConstantSuggestionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(geoTargetConstantSuggestions_);
      }
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder addGeoTargetConstantSuggestionsBuilder() {
      return getGeoTargetConstantSuggestionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.getDefaultInstance());
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder addGeoTargetConstantSuggestionsBuilder(
        int index) {
      return getGeoTargetConstantSuggestionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.getDefaultInstance());
    }
    /**
     * <pre>
     * Geo target constant suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.GeoTargetConstantSuggestion geo_target_constant_suggestions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder> 
         getGeoTargetConstantSuggestionsBuilderList() {
      return getGeoTargetConstantSuggestionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder> 
        getGeoTargetConstantSuggestionsFieldBuilder() {
      if (geoTargetConstantSuggestionsBuilder_ == null) {
        geoTargetConstantSuggestionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestion.Builder, com.google.ads.googleads.v1.services.GeoTargetConstantSuggestionOrBuilder>(
                geoTargetConstantSuggestions_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        geoTargetConstantSuggestions_ = null;
      }
      return geoTargetConstantSuggestionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse)
  private static final com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse();
  }

  public static com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestGeoTargetConstantsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SuggestGeoTargetConstantsResponse>() {
    @java.lang.Override
    public SuggestGeoTargetConstantsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SuggestGeoTargetConstantsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SuggestGeoTargetConstantsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestGeoTargetConstantsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.services.SuggestGeoTargetConstantsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

