
Exercícios de estudo (não são a prova). Estrutura no formato de entrega da avaliação.

| Pasta | Padrão | Ideia central |
|---|---|---|
| `questao1/` | **Factory Method** | Procedimento fixo (`Notificador.notificar`) escrito uma vez; subclasses decidem só o tipo criado. |
| `questao2/` | **Abstract Factory** | `AmbienteFactory` cria a família Banco+Cache+Logger; `Deploy` só conhece abstrações e não há como misturar ambientes. |

Compilar e executar (exemplo questao1):

    cd questao1/src && javac *.java && java Main

Diagramas em PlantUML (`.puml`); renderize em plantuml.com ou importe no draw.io.
