# Portfolio

```java
PortfolioController portfolioController = client.getPortfolioController();
```

## Class Name

`PortfolioController`

## Methods

* [Calculate Order Delivery Time](../../doc/controllers/portfolio.md#calculate-order-delivery-time)
* [Retrieve Multiple Products](../../doc/controllers/portfolio.md#retrieve-multiple-products)
* [Retrieve Single Product](../../doc/controllers/portfolio.md#retrieve-single-product)
* [Search Products](../../doc/controllers/portfolio.md#search-products)


# Calculate Order Delivery Time

This endpoint calculates total number of days to process and setup a campaign containing a list of Products, given a comma-separated list of their ids.

```java
CompletableFuture<List<ProductsDeliveryTimeModel>> calculateOrderDeliveryTimeAsync(
    final List<String> productsIds)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productsIds` | `List<String>` | Template, Required | - |

## Response Type

[`List<ProductsDeliveryTimeModel>`](../../doc/models/products-delivery-time-model.md)

## Example Usage

```java
List<String> productsIds = new LinkedList<>();
productsIds.add("products_ids7");
productsIds.add("products_ids8");

portfolioController.calculateOrderDeliveryTimeAsync(productsIds).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "days_to_process": 1,
    "days_to_setup": 1,
    "total_days": 2
  }
]
```


# Retrieve Multiple Products

Sometimes you already have access to the Identification codes of more than one Product and you want to retrieve the most up-to-date information about them.
Besides the default English, German and Dutch result translations can be requested by specifying an `Accept-Language: [de|nl]` header.

```java
CompletableFuture<List<ProductModel>> retrieveMultipleProductsAsync(
    final List<String> productsIds,
    final AcceptLanguageEnum acceptLanguage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productsIds` | `List<String>` | Template, Required | - |
| `acceptLanguage` | [`AcceptLanguageEnum`](../../doc/models/accept-language-enum.md) | Header, Optional | - |

## Response Type

[`List<ProductModel>`](../../doc/models/product-model.md)

## Example Usage

```java
List<String> productsIds = new LinkedList<>();
productsIds.add("products_ids7");
productsIds.add("products_ids8");
AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.EN;

portfolioController.retrieveMultipleProductsAsync(productsIds, acceptLanguage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve Single Product

Sometimes you already have access to the Identification code of any particular Product and you want to retrieve the most up-to-date information about it.
Besides the default English, German and Dutch result translations can be requested by specifying an `Accept-Language: [de|nl]` header.

```java
CompletableFuture<ProductModel> retrieveSingleProductAsync(
    final String productId,
    final AcceptLanguageEnum acceptLanguage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `productId` | `String` | Template, Required | - |
| `acceptLanguage` | [`AcceptLanguageEnum`](../../doc/models/accept-language-enum.md) | Header, Optional | - |

## Response Type

[`ProductModel`](../../doc/models/product-model.md)

## Example Usage

```java
String productId = "product_id4";
AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.EN;

portfolioController.retrieveSingleProductAsync(productId, acceptLanguage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Search Products

For a detailed tutorial on how to get started with portfolio search v2, check out our [Quickstart Tutorial](https://pkb.stoplight.io/docs/search/docs/Tutorial.md).
For an implementation demo of the product search experience, check out our [Developer Portal](http://vonq.io/pkb).
This endpoint exposes a list of Products with the options to search by Location, Job Title, Job Function and Industry.
Products are ranked by their relevancy to the search terms.
Optionally, products can filtered by Location.
Values for each parameter can be fetched by calling the other endpoints in this section.
Calling this endpoint will guarantee that the Products you see are configured for you as our Partner.
Besides the default English, German and Dutch result translations can be requested by specifying an `Accept-Language: [de|nl]` header.

```java
CompletableFuture<List<ProductModel>> searchProductsAsync(
    final Integer limit,
    final Integer offset,
    final List<String> includeLocationId,
    final String exactLocationId,
    final String jobFunctionId,
    final String jobTitleId,
    final List<String> industryId,
    final String durationFrom,
    final String durationTo,
    final String name,
    final String currency,
    final SortByEnum sortBy,
    final Boolean recommended,
    final Boolean mcEnabled,
    final AcceptLanguageEnum acceptLanguage,
    final Boolean excludeRecommended)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | Number of results to return per page. |
| `offset` | `Integer` | Query, Optional | The initial index from which to return the results. |
| `includeLocationId` | `List<String>` | Query, Optional | Id for a Location to search products against. If no exact matches exist, search will be expanded to the Location's region and country. Optionally, a (comma-separated) array of values can be passed. Passing multiple values increases the number of search results. |
| `exactLocationId` | `String` | Query, Optional | Match only products specifically assigned to a Location. |
| `jobFunctionId` | `String` | Query, Optional | Job Function id. Not to be used in conjunction with a Job Title id. |
| `jobTitleId` | `String` | Query, Optional | Job title id |
| `industryId` | `List<String>` | Query, Optional | Industry Id |
| `durationFrom` | `String` | Query, Optional | Match only products with a duration more or equal than a certain number of days |
| `durationTo` | `String` | Query, Optional | Match only products with a duration up to a certain number of days |
| `name` | `String` | Query, Optional | Search text for a product name |
| `currency` | `String` | Query, Optional | ISO-4217 code for a currency |
| `sortBy` | [`SortByEnum`](../../doc/models/sort-by-enum.md) | Query, Optional | Which products to show first. Defaults to 'relevant'<br>**Default**: `SortByEnum.RELEVANT` |
| `recommended` | `Boolean` | Query, Optional | Whether to display a list of recommended products for the search parameters. If true, returns a limited list of products for the types: Job board, social media, publication and community. |
| `mcEnabled` | `Boolean` | Query, Optional | Can be used to filter for products that are linked to a channel enabled for My Contracts orders |
| `acceptLanguage` | [`AcceptLanguageEnum`](../../doc/models/accept-language-enum.md) | Header, Optional | - |
| `excludeRecommended` | `Boolean` | Query, Optional | Exclude recommended products from search results. Cannot be used in combination with 'recommended'.<br>**Default**: `false` |

## Response Type

[`List<ProductModel>`](../../doc/models/product-model.md)

## Example Usage

```java
SortByEnum sortBy = SortByEnum.RELEVANT;
AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.EN;
Boolean excludeRecommended = false;

portfolioController.searchProductsAsync(null, null, null, null, null, null, null, null, null, null, null, sortBy, null, null, acceptLanguage, excludeRecommended).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | `ApiException` |

