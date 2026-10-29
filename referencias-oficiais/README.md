# Referências oficiais da Alura

Materiais mantidos pela organização [alura-cursos](https://github.com/alura-cursos), vinculados pelos próprios cursos. Cada pasta é um submódulo Git fixado em um commit, preservando a origem e a autoria dos instrutores. Os exercícios desenvolvidos por mim permanecem nas pastas 01 a 08.

| Pasta | Curso | Origem e branch |
| --- | --- | --- |
| [09-refatoracao-java](./09-refatoracao-java) | [Java e refatoração: melhorando códigos com boas práticas](https://cursos.alura.com.br/course/java-refatoracao-melhorando-codigos-boas-praticas) | [alura-cursos/3149-boas-praticas-java — main](https://github.com/alura-cursos/3149-boas-praticas-java/tree/main) |
| [10-boas-praticas-api-java](./10-boas-praticas-api-java) | [Boas práticas de programação: melhore o código de uma API Java](https://cursos.alura.com.br/course/boas-praticas-programacao-melhore-codigo-api-java) | [alura-cursos/3238-boas-praticas-java — main](https://github.com/alura-cursos/3238-boas-praticas-java/tree/main) |
| [11-testes-java](./11-testes-java) | [Boas práticas de programação: automatizando testes com Java](https://cursos.alura.com.br/course/boas-praticas-programacao-testes-java) | [alura-cursos/3349-boas-praticas-java-testes — main](https://github.com/alura-cursos/3349-boas-praticas-java-testes/tree/main) |
| [12-git-github-allbooks](./12-git-github-allbooks) | [DevOps: trabalhando com repositórios no GitHub](https://cursos.alura.com.br/course/devops-trabalhando-repositorios-github) | [alura-cursos/allbooks — aula-01](https://github.com/alura-cursos/allbooks/tree/aula-01) |
| [13-excecoes-java](./13-excecoes-java) | [Java exceções: aprenda a criar, lançar e controlar exceções](https://cursos.alura.com.br/course/java-excecoes-aprenda-criar-lancar-controlar-excecoes) | [alura-cursos/java-exceptions — projeto_inicial](https://github.com/alura-cursos/java-exceptions/tree/projeto_inicial) |

## Baixar os materiais

```bash
git clone --recurse-submodules https://github.com/Jhowzxcv/Alura_Java.git
```

Em uma cópia já existente:

```bash
git submodule update --init --recursive
```

Os projetos oficiais podem exigir versões diferentes de Java, Node ou banco. Consulte o README e as branches de aula de cada origem antes de executar. Os commits usados estão registrados em [fontes.json](./fontes.json). Licenças e avisos autorais são os publicados pelos respectivos repositórios.

Os cursos práticos sem repositório oficial identificado ficam listados no [catálogo da trilha](../trilha-java/README.md), junto dos demais cursos e seus links.
