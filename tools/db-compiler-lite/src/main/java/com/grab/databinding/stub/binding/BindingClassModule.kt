/*
 * Copyright 2021 Grabtaxi Holdings PTE LTE (GRAB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.grab.databinding.stub.binding

import com.grab.databinding.stub.binding.generator.BindingClassGenerator
import com.grab.databinding.stub.binding.generator.DefaultBindingClassGenerator
import com.grab.databinding.stub.binding.store.LayoutStoreModule
import dagger.Binds
import dagger.Module

@Module(includes = [LayoutStoreModule::class])
interface BindingClassModule {
    @Binds
    fun DefaultBindingClassGenerator.bindingClassGenerator(): BindingClassGenerator
}