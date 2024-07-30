## 문제 상황

1. API 문서가 여러 군데에서 관리되어 '최신 API 문서'가 어디에 존재하는지에 대한 인지부하가 존재합니다.
2. API 문서 수정 시, 반영된 사항이 코드에 곧바로 반영되지 않거나, FE/BE 모두 한 곳을 바라보지 않을 수 있습니다.
3. 휴먼 에러로 인한 API 설계의 문제가 발생할 수 있습니다.

## 해결 방안

- FE, BE 모두 함께 API 문서를 설계합니다. 이때, 관리는 `.yml` 형식의 [OpenApi 3.0 specification](https://swagger.io/specification/)을 따릅니다.
- 해당 문서를 기반으로, 백엔드 코드 제너레이터를 활용해 Swagger interface를 생성합니다. 이때, 수정이 일어나는 경우 해당 interface를 수정하는 것이 아닌, 전체 yaml 파일을 수정한 뒤
  이를 적용하도록 합니다.
- (가능하다면) 제공하는 Swagger interface에 대한 Mock server를 구현해 최대한 빠르게 FE 측에 제공합니다.
- API 설계 - 코드 반영 - 피드백을 빠르게 순환하도록 하며, 이를 통해 개발 효율성을 높일 수 있습니다.

## 무엇이 다른가요?

- 기존에는 코드 먼저 구현한 뒤, 이를 기반으로 하는 API 문서화를 진행했습니다. 이 경우 코드가 API 문서를 뒤따르는 형태가 됩니다. (Code first)
- 해당 문서에서는 API 문서를 먼저 약속한 뒤, 이를 기반으로 코드를 생성하는 것을 설명합니다. (API first)
- API 문서 또한 버저닝이 가능합니다. `yml` 파일을 우선적으로 수정하고 이를 코드에 반영하는 형태이기 때문에, Git과 같은 VCS에서 변경 이력을 확인하는 것이 매우 용이합니다.

## 어떻게요?

본 문서는 백엔드 개발자의 관점에서 설명합니다.

1. API 문서를 함께 작성합니다. 이때의 **함께**는 백엔드 개발자 외에도 기획자, 프론트엔드 등 다양한 관계자가 참여함을 의미합니다.
2. API 문서가 작성된 것을 기반으로 코드를 생성합니다. OpenAPI Generator를 사용하며, 이를 통해 `openapi-generated` 폴더에 생성된 API의 인터페이스, Dto Model을 확인할
   수 있습니다.
3. 해당 인터페이스를 Controller가 구현하도록 합니다.
4. API에 수정사항이 생기는 경우, 인터페이스를 수정하지 않습니다. 해당하는 API 문서(`yml`)을 수정한 뒤, 2번 항목부터 다시 진행합니다.

## 참고한 것

- 인프콘 2023: 오늘도 여러분의 API는 안녕하신가요?: API First Design과 CodeGen 활용하기 (무료 강의로 열려 있습니다!)
- https://github.com/LenKIM/openapi-code-gen (위 발표의 참고 Github Repository)
- https://openapi-generator.tech/ (Codegen)
- https://github.com/OpenAPITools/openapi-generator
