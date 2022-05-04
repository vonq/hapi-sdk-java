
# LoggingConfiguration.Builder Class

Class to build instances of {@link LoggingConfiguration}.

## Constructors

| Name | Description |
|  --- | --- |
| `Builder()` | Default Constructor to initiate builder with default properties. |

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `logRequestInfo(boolean enable)` | Enable or disable logging of request info. Request info contains "url" and "httpMethod". By default this is disabled. | `Builder` |
| `logResponseInfo(boolean enable)` | Enable or disable logging of response info. Response info contains "statusCode", "url", and "timeTaken". By default this is disabled. | `Builder` |
| `logRequestHeaders(boolean enable)` | Enable or disable logging of headers for requests. By default this is disabled. | `Builder` |
| `logResponseHeaders(boolean enable)` | Enable or disable logging of headers for responses. By default this is disabled. | `Builder` |
| `logRequestBody(boolean enable)` | Enable or disable logging of request body or form parameters. By default this is disabled. | `Builder` |
| `logResponseBody(boolean enable)` | Enable or disable logging of response body. By default this is disabled. | `Builder` |
| `logEverything()` | Enable all logs. | `Builder` |
| `logNothing()` | Disable all logs. | `Builder` |
| `prettyPrintLogs(boolean enable)` | Enable or disable pretty printing for logging. By default this is disabled. | `Builder` |
| `level(Level level)` | Set level for logging. Default level is INFO. | `Builder` |
| `headerLoggingPolicy(HeaderLoggingPolicy policy)` | Set logging policy for headers. Default policy is EXCLUDE. | `Builder` |
| `clearHeaderFilter()` | Clear all filters for headers. | `Builder` |
| `addHeaderFilter(String header)` | Add given header as a filter for logging headers. | `Builder` |
| `build()` | Builds a new LoggingConfiguration object using the set fields. | `LoggingConfiguration` |

