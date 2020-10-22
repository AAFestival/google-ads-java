// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/customer_extension_setting.proto

package com.google.ads.googleads.v5.resources;

public interface CustomerExtensionSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.CustomerExtensionSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer extension setting.
   * CustomerExtensionSetting resource names have the form:
   * `customers/{customer_id}/customerExtensionSettings/{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer extension setting.
   * CustomerExtensionSetting resource names have the form:
   * `customers/{customer_id}/customerExtensionSettings/{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The extension type of the customer extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for extensionType.
   */
  int getExtensionTypeValue();
  /**
   * <pre>
   * Immutable. The extension type of the customer extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The extensionType.
   */
  com.google.ads.googleads.v5.enums.ExtensionTypeEnum.ExtensionType getExtensionType();

  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 3 [(.google.api.resource_reference) = { ... }</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getExtensionFeedItemsList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 3 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValue getExtensionFeedItems(int index);
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 3 [(.google.api.resource_reference) = { ... }</code>
   */
  int getExtensionFeedItemsCount();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 3 [(.google.api.resource_reference) = { ... }</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getExtensionFeedItemsOrBuilderList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue extension_feed_items = 3 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getExtensionFeedItemsOrBuilder(
      int index);

  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 4;</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 4;</code>
   * @return The device.
   */
  com.google.ads.googleads.v5.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice getDevice();
}