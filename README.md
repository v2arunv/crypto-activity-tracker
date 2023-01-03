## Goal

Get information from BSC, Ethereum and Polygon chains by querying the respective scanners. These include:
- All transactions in the past X hours/days/months
- Categorise transactions by token type

### Folder structure

`scarper` contains pythong code that fetches data from upstream services
`api` contains Kotlin code and provides the API for end users

### Technology

- Python service to get all data from upstream sources and Kotlin service to serve users. Both these services interact via gRPC with each other.
- All code in all services must be tested
- Use E2E framework to test comprehensively
- Deploy using docker compose or on K8s if we get the chance




