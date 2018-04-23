package org.hades.wonder.sample.components;

import org.hades.wonder.sample.TestViewModel;

import dagger.Component;

/**
 * Created by Hades on 2017/11/2.
 */
@Component
public interface TestComponent {
    void inject(TestViewModel viewModel);
}
