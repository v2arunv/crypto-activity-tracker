## Goal

Get information from BSC, Ethereum and Polygon chains by querying the respective scanners. These include:
- All transactions in the past X hours/days/months
- Categorise transactions by token type

### Technology

- Python service to get all data from upstream sources and Kotlin service to serve users. Both these services interact via gRPC with each other.
- All code in all services must be tested
- Use E2E framework to test comprehensively
- Deploy using docker compose or on K8s if we get the chance
