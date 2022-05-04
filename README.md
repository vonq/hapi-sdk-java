
# Getting Started with VONQ Hiring API

## Introduction

The VONQ Hiring API aims to provide all the basic VONQ Services through a comprehensive [RESTful](https://en.wikipedia.org/wiki/Representational_state_transfer) API. Systems would be able to
consume these services to list available VONQ Products and create Campaigns based on those Products.

### Overview

Our latest API version is currently version 2. It offers more search facets and filters,
a new recommendation engine, and a richer, evolving set of taxonomies so your users can find the most relevant,
best-performing products for their vacancies.

#### Schema

The API can be accessed at `https://marketplace.api.vonq.com` and is HTTPS-only. All requests must be
encoded in JSON, and all responses will be encoded in JSON as well.

#### Environments

We currently support two different environments for the Hiring API. The `Production` environment is
connected to our other `Production` backend services. That means that any order sent to this
environment is considered final and processed.

At the same time we support a `Sandbox` environment, accessible via `https://marketplace-sandbox.api.vonq.com`. You can safely test your API implementation here.
None of the orders sent to this environment are considered final, so they will not be executed nor charged. This
environment requires a different API Token to operate, which will be provided to you when available.

#### HTTP Methods

Whenever possible, the Hiring API uses RESTful `HTTP` methods for its actions.
| HTTP Method | Description                                      |
|:----------|--------------------------------------------------|
| `GET`     | Retrieve one or several Resources                |
| `POST`    | Create a new Resource. Eg: Create a new Campaign |
| `PATCH`   | Change part of the structure of a Resource       |

#### Pagination

Lists of multiple Resources will automatically paginate every 50 items by default. You can retrieve more elements by
specifying a value for the `offset` parameter (the default `offset` is 0). If you need to change the
number of elements returned by the default pagination, you can do so using the `limit` query parameter.

Example:

```

curl https://marketplace.api.vonq.com/portfolio?limit=100&offset=400

```

#### User-Agent

We recommend that every request made to the Hiring API includes a `User-Agent` header. This is not a mandatory
requirement at the moment, but this may change in the future. Specifying your User-Agent will allow us to provide you with more effective support.

#### Error Codes

The Hiring API uses standard HTTP Status codes for its responses to inform your system how the Hiring API handled your request.
Response codes in the range of `2xx` represent success codes (Eg, `201 Created`).
Codes in the `4xx` range indicates an error on the request performed, usually because the payload used doesn't contain
all the necessary information or is in an invalid format (Eg, `400 Bad Request`).
The error codes in the `5xx` range mean that an error occurred in the Hiring API and we were not able to handle your request.
It can also happen when our services are temporarily not available (Eg, `500 Internal Server Error`). These should be rare. We log these errors and investigate them as soon as possible.

The following Response coded are shared amongst all endpoints:

+ Response 400 (application/json)
  
        {
            "requestBody": "The request does not contain valid JSON."
        }

+ Response 401 (application/json)
  
        {
            "authentication": "Authentication Required"
        }

+ Response 401 (application/json)
  
        {
            "authentication": "Username could not be found."
        }

+ Response 500 (application/json)

#### Caching

We recommend avoiding using cached versions of portfolio and taxonomy data since it is subject to regular updates. Campaign ordeproducts  invalid taxonomy will be rejected.
If you do need to use caching, we recommend refreshing it daily.

#### Rate Limits

To prevent abuse and ensure service stability, all the API requests are rate limited. Rate limits specify
the maximum number of API calls (60) that can be made in 60 seconds. These limits reset every 60 seconds.
User of the API can make upto 60 request per 60 seconds.

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=import3)

## Installation

The following section explains how to use the HAPI library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *HAPI* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify HAPI in `Group Id`, hapi in `Artifact Id` and 2.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=HAPI-Java&workspaceName=HAPI&projectName=HAPI&rootNamespace=com.vonq.api.marketplacesandbox&groupId=HAPI&artifactId=hapi&version=2.0.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project HAPI from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

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

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| sandbox | **Default** Sandbox |
| production | Production |

## List of APIs

* [Campaigns](doc/controllers/campaigns.md)
* [Contracts](doc/controllers/contracts.md)
* [Portfolio](doc/controllers/portfolio.md)
* [Taxonomy](doc/controllers/taxonomy.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)
* [LoggingConfiguration](doc/logging-configuration.md)
* [LoggingConfiguration.Builder](doc/logging-configuration-builder.md)
* [LoggingConfiguration.Level Enum](doc/logging-configuration-level-enum.md)
* [LoggingConfiguration.HeaderLoggingPolicy Enum](doc/logging-configuration-header-logging-policy-enum.md)

