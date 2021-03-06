package nl.yasper.neuralib.network.perceptron;

import nl.yasper.neuralib.network.activation.ActivationFunction;

public class InputPerceptron extends Perceptron {

    public InputPerceptron() {
        super(1, ActivationFunction.IDENTITY);
    }

    @Override
    public double getWeightedProduct(double[] inputs) {
        return inputs[0];
    }

    @Override
    public InputPerceptron createNew() {
        return new InputPerceptron();
    }
}
