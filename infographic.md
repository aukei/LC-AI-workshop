graph LR
    subgraph Human Cognitive Thinking
        A[Sensory Input] --> B[Perception]
        B --> C[Memory]
        C --> D[Reasoning]
        D --> E[Decision Making]
        E --> F[Learning]
        F --> C
    end

    subgraph Cognitive AI
        G[Data Input] --> H[Pattern Recognition]
        H --> I[Prediction]
        I --> J[Limited Adaptation]
    end

    M[Real World Problems] --> A
    M --> G

    subgraph Historical Context
    timeline
        title Evolution of Cognitive Understanding
        500 BCE : Ancient Philosophy
        1600s : Scientific Revolution
        1879 : Modern Psychology Birth
        1950s : Cognitive Revolution
    end
    style Human Cognitive Thinking fill:#e3f2fd
    style Cognitive AI fill:#fff3e0