# Padrão Chain of Responsibility

Exemplo do padrão comportamental **Chain of Responsibility** aplicado à abertura
de chamados de suporte de TI. Um chamado entra pelo primeiro nível de atendimento
e, se aquele nível não trata aquele tipo de chamado, é escalado automaticamente
para o nível superior (N1 → N2 → N3 → Gerente de TI). Se nenhum nível trata o
tipo, o chamado fica sem atendimento.

## Conteúdo do repositório

- **Código-fonte** do exemplo implementando o padrão Chain of Responsibility (chamados de suporte de TI).
- **Casos de teste** (JUnit) cobrindo o atendimento no primeiro nível, a escalada entre níveis e o caso sem atendimento.
- **Diagrama UML** das classes, em formato de imagem.
