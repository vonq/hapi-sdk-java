
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.SANDBOX`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `loggingConfig` | `ReadonlyLoggingConfiguration` | Logging Configuration instance. |

The API client can be initialized as follows:

```java
HAPIClient client = new HAPIClient.Builder()
    .loggingConfig(builder -> builder
            .level(Level.DEBUG)
            .logEverything())
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.SANDBOX)
    .build();
```

## VONQ Hiring APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getPortfolioController()` | Provides access to Portfolio controller. | `PortfolioController` |
| `getContractsController()` | Provides access to Contracts controller. | `ContractsController` |
| `getCampaignsController()` | Provides access to Campaigns controller. | `CampaignsController` |
| `getTaxonomyController()` | Provides access to Taxonomy controller. | `TaxonomyController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getLoggingConfig()` | Logging Configuration instance. | `ReadonlyLoggingConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

