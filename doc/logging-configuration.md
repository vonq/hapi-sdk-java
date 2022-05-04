
# LoggingConfiguration Class

Class for holding logging configuration.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `isLoggingRequestInfo()` | Is logging request info enabled. | `boolean` |
| `isLoggingResponseInfo()` | Is logging response info enabled. | `boolean` |
| `isLoggingRequestHeaders()` | Is logging request headers enabled. | `boolean` |
| `isLoggingResponseHeaders()` | Is logging response headers enabled. | `boolean` |
| `isLoggingRequestBody()` | Is logging request body enabled. | `boolean` |
| `isLoggingResponseBody()` | Is logging response body enabled. | `boolean` |
| `isPrettyPrinting()` | Is pretty printing log message enabled. | `boolean` |
| `getLevel()` | Getter for level. | `Level` |
| `getHeaderLoggingPolicy()` | Getter for header logging policy. | `HeaderLoggingPolicy` |
| `getHeaderFilters()` | Getter for headers' filters. | `Set<String>` |
| `toString()` | Converts this LoggingConfiguration into string format. | `String` |
| `newBuilder()` | Builds a new {@link LoggingConfiguration.Builder} object. Creates the instance with the current state. | `LoggingConfiguration.Builder` |

