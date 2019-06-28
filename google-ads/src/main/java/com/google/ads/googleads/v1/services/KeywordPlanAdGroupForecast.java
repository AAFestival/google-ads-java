// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_service.proto

package com.google.ads.googleads.v1.services;

/**
 * <pre>
 * An ad group forecast.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.services.KeywordPlanAdGroupForecast}
 */
public  final class KeywordPlanAdGroupForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.services.KeywordPlanAdGroupForecast)
    KeywordPlanAdGroupForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanAdGroupForecast.newBuilder() to construct.
  private KeywordPlanAdGroupForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanAdGroupForecast() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanAdGroupForecast(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (keywordPlanAdGroup_ != null) {
              subBuilder = keywordPlanAdGroup_.toBuilder();
            }
            keywordPlanAdGroup_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keywordPlanAdGroup_);
              keywordPlanAdGroup_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.ads.googleads.v1.services.ForecastMetrics.Builder subBuilder = null;
            if (adGroupForecast_ != null) {
              subBuilder = adGroupForecast_.toBuilder();
            }
            adGroupForecast_ = input.readMessage(com.google.ads.googleads.v1.services.ForecastMetrics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adGroupForecast_);
              adGroupForecast_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.class, com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.Builder.class);
  }

  public static final int KEYWORD_PLAN_AD_GROUP_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue keywordPlanAdGroup_;
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
   */
  public boolean hasKeywordPlanAdGroup() {
    return keywordPlanAdGroup_ != null;
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
   */
  public com.google.protobuf.StringValue getKeywordPlanAdGroup() {
    return keywordPlanAdGroup_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanAdGroup_;
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getKeywordPlanAdGroupOrBuilder() {
    return getKeywordPlanAdGroup();
  }

  public static final int AD_GROUP_FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v1.services.ForecastMetrics adGroupForecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  public boolean hasAdGroupForecast() {
    return adGroupForecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  public com.google.ads.googleads.v1.services.ForecastMetrics getAdGroupForecast() {
    return adGroupForecast_ == null ? com.google.ads.googleads.v1.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  public com.google.ads.googleads.v1.services.ForecastMetricsOrBuilder getAdGroupForecastOrBuilder() {
    return getAdGroupForecast();
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
    if (keywordPlanAdGroup_ != null) {
      output.writeMessage(1, getKeywordPlanAdGroup());
    }
    if (adGroupForecast_ != null) {
      output.writeMessage(2, getAdGroupForecast());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keywordPlanAdGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeywordPlanAdGroup());
    }
    if (adGroupForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroupForecast());
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
    if (!(obj instanceof com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast other = (com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast) obj;

    boolean result = true;
    result = result && (hasKeywordPlanAdGroup() == other.hasKeywordPlanAdGroup());
    if (hasKeywordPlanAdGroup()) {
      result = result && getKeywordPlanAdGroup()
          .equals(other.getKeywordPlanAdGroup());
    }
    result = result && (hasAdGroupForecast() == other.hasAdGroupForecast());
    if (hasAdGroupForecast()) {
      result = result && getAdGroupForecast()
          .equals(other.getAdGroupForecast());
    }
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
    if (hasKeywordPlanAdGroup()) {
      hash = (37 * hash) + KEYWORD_PLAN_AD_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanAdGroup().hashCode();
    }
    if (hasAdGroupForecast()) {
      hash = (37 * hash) + AD_GROUP_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupForecast().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast prototype) {
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
   * An ad group forecast.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.services.KeywordPlanAdGroupForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.services.KeywordPlanAdGroupForecast)
      com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.class, com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keywordPlanAdGroupBuilder_ == null) {
        keywordPlanAdGroup_ = null;
      } else {
        keywordPlanAdGroup_ = null;
        keywordPlanAdGroupBuilder_ = null;
      }
      if (adGroupForecastBuilder_ == null) {
        adGroupForecast_ = null;
      } else {
        adGroupForecast_ = null;
        adGroupForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v1_services_KeywordPlanAdGroupForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast build() {
      com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast buildPartial() {
      com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast result = new com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast(this);
      if (keywordPlanAdGroupBuilder_ == null) {
        result.keywordPlanAdGroup_ = keywordPlanAdGroup_;
      } else {
        result.keywordPlanAdGroup_ = keywordPlanAdGroupBuilder_.build();
      }
      if (adGroupForecastBuilder_ == null) {
        result.adGroupForecast_ = adGroupForecast_;
      } else {
        result.adGroupForecast_ = adGroupForecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast) {
        return mergeFrom((com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast other) {
      if (other == com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast.getDefaultInstance()) return this;
      if (other.hasKeywordPlanAdGroup()) {
        mergeKeywordPlanAdGroup(other.getKeywordPlanAdGroup());
      }
      if (other.hasAdGroupForecast()) {
        mergeAdGroupForecast(other.getAdGroupForecast());
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
      com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue keywordPlanAdGroup_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> keywordPlanAdGroupBuilder_;
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public boolean hasKeywordPlanAdGroup() {
      return keywordPlanAdGroupBuilder_ != null || keywordPlanAdGroup_ != null;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public com.google.protobuf.StringValue getKeywordPlanAdGroup() {
      if (keywordPlanAdGroupBuilder_ == null) {
        return keywordPlanAdGroup_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanAdGroup_;
      } else {
        return keywordPlanAdGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public Builder setKeywordPlanAdGroup(com.google.protobuf.StringValue value) {
      if (keywordPlanAdGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keywordPlanAdGroup_ = value;
        onChanged();
      } else {
        keywordPlanAdGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public Builder setKeywordPlanAdGroup(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (keywordPlanAdGroupBuilder_ == null) {
        keywordPlanAdGroup_ = builderForValue.build();
        onChanged();
      } else {
        keywordPlanAdGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public Builder mergeKeywordPlanAdGroup(com.google.protobuf.StringValue value) {
      if (keywordPlanAdGroupBuilder_ == null) {
        if (keywordPlanAdGroup_ != null) {
          keywordPlanAdGroup_ =
            com.google.protobuf.StringValue.newBuilder(keywordPlanAdGroup_).mergeFrom(value).buildPartial();
        } else {
          keywordPlanAdGroup_ = value;
        }
        onChanged();
      } else {
        keywordPlanAdGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public Builder clearKeywordPlanAdGroup() {
      if (keywordPlanAdGroupBuilder_ == null) {
        keywordPlanAdGroup_ = null;
        onChanged();
      } else {
        keywordPlanAdGroup_ = null;
        keywordPlanAdGroupBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getKeywordPlanAdGroupBuilder() {
      
      onChanged();
      return getKeywordPlanAdGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getKeywordPlanAdGroupOrBuilder() {
      if (keywordPlanAdGroupBuilder_ != null) {
        return keywordPlanAdGroupBuilder_.getMessageOrBuilder();
      } else {
        return keywordPlanAdGroup_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanAdGroup_;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getKeywordPlanAdGroupFieldBuilder() {
      if (keywordPlanAdGroupBuilder_ == null) {
        keywordPlanAdGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getKeywordPlanAdGroup(),
                getParentForChildren(),
                isClean());
        keywordPlanAdGroup_ = null;
      }
      return keywordPlanAdGroupBuilder_;
    }

    private com.google.ads.googleads.v1.services.ForecastMetrics adGroupForecast_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.services.ForecastMetrics, com.google.ads.googleads.v1.services.ForecastMetrics.Builder, com.google.ads.googleads.v1.services.ForecastMetricsOrBuilder> adGroupForecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public boolean hasAdGroupForecast() {
      return adGroupForecastBuilder_ != null || adGroupForecast_ != null;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public com.google.ads.googleads.v1.services.ForecastMetrics getAdGroupForecast() {
      if (adGroupForecastBuilder_ == null) {
        return adGroupForecast_ == null ? com.google.ads.googleads.v1.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
      } else {
        return adGroupForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder setAdGroupForecast(com.google.ads.googleads.v1.services.ForecastMetrics value) {
      if (adGroupForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroupForecast_ = value;
        onChanged();
      } else {
        adGroupForecastBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder setAdGroupForecast(
        com.google.ads.googleads.v1.services.ForecastMetrics.Builder builderForValue) {
      if (adGroupForecastBuilder_ == null) {
        adGroupForecast_ = builderForValue.build();
        onChanged();
      } else {
        adGroupForecastBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder mergeAdGroupForecast(com.google.ads.googleads.v1.services.ForecastMetrics value) {
      if (adGroupForecastBuilder_ == null) {
        if (adGroupForecast_ != null) {
          adGroupForecast_ =
            com.google.ads.googleads.v1.services.ForecastMetrics.newBuilder(adGroupForecast_).mergeFrom(value).buildPartial();
        } else {
          adGroupForecast_ = value;
        }
        onChanged();
      } else {
        adGroupForecastBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder clearAdGroupForecast() {
      if (adGroupForecastBuilder_ == null) {
        adGroupForecast_ = null;
        onChanged();
      } else {
        adGroupForecast_ = null;
        adGroupForecastBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public com.google.ads.googleads.v1.services.ForecastMetrics.Builder getAdGroupForecastBuilder() {
      
      onChanged();
      return getAdGroupForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public com.google.ads.googleads.v1.services.ForecastMetricsOrBuilder getAdGroupForecastOrBuilder() {
      if (adGroupForecastBuilder_ != null) {
        return adGroupForecastBuilder_.getMessageOrBuilder();
      } else {
        return adGroupForecast_ == null ?
            com.google.ads.googleads.v1.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.services.ForecastMetrics, com.google.ads.googleads.v1.services.ForecastMetrics.Builder, com.google.ads.googleads.v1.services.ForecastMetricsOrBuilder> 
        getAdGroupForecastFieldBuilder() {
      if (adGroupForecastBuilder_ == null) {
        adGroupForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v1.services.ForecastMetrics, com.google.ads.googleads.v1.services.ForecastMetrics.Builder, com.google.ads.googleads.v1.services.ForecastMetricsOrBuilder>(
                getAdGroupForecast(),
                getParentForChildren(),
                isClean());
        adGroupForecast_ = null;
      }
      return adGroupForecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.services.KeywordPlanAdGroupForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.services.KeywordPlanAdGroupForecast)
  private static final com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast();
  }

  public static com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanAdGroupForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanAdGroupForecast>() {
    @java.lang.Override
    public KeywordPlanAdGroupForecast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanAdGroupForecast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanAdGroupForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanAdGroupForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.services.KeywordPlanAdGroupForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

